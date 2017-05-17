package higher_lower;

import java.util.Random;
import java.util.Scanner;

/**
 * A Higher-Lower number guessing game, the machine picks a number between 1 and 100 inclusive and the player has TURNS number of turns to guess it.
 * @author hb
 *
 */
public class HigherLower {
	//total number of turns the player has to guess the number
	private static int TURNS = 10;
	private Random rand = new Random();
	//does this count as abusing globals?
	private static Scanner inputScanner = new Scanner(System.in);
	
	//this is going to be doing everything, it really shouldn't
	public void play()
	{
		int target = rand.nextInt(99) + 1;// add 1 because you can't change the lower limit.
		int turn = 0;
		int guess;
		System.out.println("Guess the number between 1 and 100, you have 10 guesses.");
		while (turn < TURNS)
		{
			System.out.printf("%02d%s", TURNS-turn, ">");
			//get input
			try
			{
				guess = inputScanner.nextInt();
				if(guess < target)
					System.out.println("Higher.");
				if(guess > target)
					System.out.println("Lower.");
				turn++;
				if(guess == target)
				{
					System.out.println("You got it!");
					if(playAgain() == true)
					{
						turn = 0;
					}
					else
					{
					return;
					}
				}
				
			}
			catch (Exception e)
			{
				System.out.println("Incorrect input, please enter an integer between 1 and 100 inclusive.");
				inputScanner.nextLine();
			}
			
		}
		//if it gets down here then the player hasn't won
		System.out.println("You fucked up!");
		
		inputScanner.close();
		return;
	}
	
	private boolean playAgain()
	{
		System.out.println("Play again? y/n");
		System.out.print(">");
		while(true)
		{
			if(((inputScanner.nextLine()).toLowerCase()).equals("y")){
				return true;
			}
			if(((inputScanner.nextLine()).toLowerCase()).equals("n")){
				return false;
			}
			System.out.println("Bad input, play again? y/n");
			System.out.print(">");
			inputScanner.nextLine();
		}
		 //Is it bad convention to have this here?

	}

}

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
	private static Random rand = new Random();
	private static int TARGET = rand.nextInt(99) + 1;// add 1 because you can't change the lower limit.
	private static Scanner inputScanner = new Scanner(System.in);
	
	//this is going to be doing everything, it really shouldn't
	public void play()
	{
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
				turn++;
			}
			catch (Exception e)
			{
				System.out.println("Incorrect input, please enter an integer between 1 and 100 inclusive.");
				inputScanner.nextLine();
			}
			
		}
		inputScanner.close();
		return;
	}
	
	//no point defining custom exceptions
	private void validateInput(String input) throws Exception
	{
		
	}

}

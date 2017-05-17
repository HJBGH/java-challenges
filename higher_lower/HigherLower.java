package higher_lower;

import java.util.Random;

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
	
	//this is going to be doing everything, it really shouldn't
	public void play()
	{
		int turn = 0;
		System.out.println("Guess the number between 1 and 100");
		while (turn < TURNS)
		{
			System.out.print(">");
			//get input
			try
			{
				
			}
			catch (Exception e)
			{
				
			}
			System.out.println("FUCK YOU " + turn);
			//input goes here
			turn++;
		}
		return;
	}
	
	//no point defining custom exceptions
	private void validateInput(String input) throws Exception
	{
		
	}

}

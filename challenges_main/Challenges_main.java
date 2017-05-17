package challenges_main;

import name_generator.*;
import higher_lower.*;

/** Main class for executing the Classes in which challenges are implemented/solved */
public class Challenges_main {
	public static void main(String[] args){
		HigherLower higherLower = new HigherLower();
		try {
			higherLower.play();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}

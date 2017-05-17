package challenges_main;

import name_generator.*;
import higher_lower.*;
import fizzbuzz.*;

/** Main class for executing the Classes in which challenges are implemented/solved */
public class Challenges_main {
	public static void main(String[] args){
		FizzBuzz fizzbuzz = new FizzBuzz();
		try {
			fizzbuzz.run();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}

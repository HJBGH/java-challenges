package challenges_main;

import name_generator.*;

/** Main class for executing the Classes in which challenges are implemented/solved */
public class Challenges_main {
	public static void main(String[] args){
		NameGenerator nameGen = new NameGenerator(); //NameGenerator has no fancy constructor
		nameGen.generate(args);
	}
}

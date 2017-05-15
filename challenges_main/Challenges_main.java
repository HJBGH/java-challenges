package challenges_main;

import name_generator.*;

/** Main class for executing the Classes in which challenges are implemented/solved */
public class Challenges_main {
	public static void main(String[] args){
		NameGenerator nameGen;
		try {
			nameGen = new NameGenerator(args);
			nameGen.generate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} //NameGenerator has no fancy constructor
	}
}

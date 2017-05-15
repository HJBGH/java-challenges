package name_generator;

import java.io.*;
import java.util.*;

/** Reads in first names, last names, street addresses, and mobile phone numbers from files indicated by
 * 	their names which are passed in as arguments. The desired number of detail sets (names) to be generated is passed in
 * 	as an optional argument at the end of args.
 * @author hb
 *
 */
public class NameGenerator {
	private static int MIN_EXPECTED_ARGS = 4;
	private static int MAX_EXPECTED_ARGS = 5;
	private static int DEFAULT_NAME_QUOTA = 15;
	
	private static int FNAMES = 0;
	private static int SNAMES = 1;
	private static int ADDR = 2;
	private static int MOB_FON = 3;
	private static int USERS_NAME_QUOTA_LOCATION = 4;
	
	private String args[];
	
	public NameGenerator(String args[]) throws Exception
	{
		try
		{
			validateArgs(args);
			this.args = args;
			PrintWriter printWriter = new PrintWriter("generated_names", "UTF-8");
			int quota = (int) ((args.length == 4) ? DEFAULT_NAME_QUOTA : args[USERS_NAME_QUOTA_LOCATION]);
			// no good solution here.
			File[] files = {new File(args[FNAMES]),
							new File(args[SNAMES]), 
							new File(args[ADDR]),
							new File(args[MOB_FON])}; 
			
			for(int x=0; x<quota; x++)
			{
				String outline = "";
				for(int i=0; i<args.length; i++){
					outline = outline + getSample(files[i]) + "\n";
				}
				//write the outline to the outfile
				printWriter.append(outline);
				
			}
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	public void generate()
	{
		System.out.println("Generating names");
		//This is going to end up as a monolithic method
		
	}
	
	private void validateArgs(String args[]) throws Exception
	{
		//args[4] being the optional user entered name quota
		//doesn't validate against illegal filenames 
		if(((args.length < MIN_EXPECTED_ARGS || args.length > MAX_EXPECTED_ARGS) || !(args[4].matches("[0-9]+"))) == true)
		{
			throw new Exception("Arguments invalid");
		}
		return;
	}
	
	//primitive reservoir sampling, used to get a random line from each file
	private String getSample(File infile) throws FileNotFoundException
	{
		String sample = null;
		Random rand = new Random();
		int n = 0;
		for(Scanner scanner = new Scanner(infile); scanner.hasNext(); )
		{
			++n;
			String line = scanner.nextLine();
			if(rand.nextInt(n) == 0)
				sample = line;
		}
		return sample;
	}

}

package name_generator;

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
	private String args[];
	
	public NameGenerator(String args[]) throws Exception
	{
		if(validateArgs(args))
		{
			this.args = args;
		}
		else
		{
			throw new Exception("Arguments invalid, I'd write a more helpful message but I won't");
		}
	}
	
	public void generate()
	{
		//This is going to end up as a monolithic method
		
	}
	
	private boolean validateArgs(String[] args)
	{
		//args[4] being the optional user entered name quota
		return ((args.length < MIN_EXPECTED_ARGS || args.length > MAX_EXPECTED_ARGS) || !(args[4].matches("[0-9]+")));
	}
	

}

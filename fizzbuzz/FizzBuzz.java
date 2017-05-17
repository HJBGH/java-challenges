package fizzbuzz;

public class FizzBuzz {
	private static int LIMIT = 100;
	
	public void run()
	{
		int i = 1;
		while(i <= LIMIT)
		{
			if(i%3 == 0)
				System.out.print("fizz");
			if(i%5 == 0)
				System.out.print("buzz");
			if(i%5 != 0 && i%3 !=0)
				System.out.print(i);
			System.out.println();
			i++;
		}
	}
	
	
}

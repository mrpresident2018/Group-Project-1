// Saurabh Bansal
public class SaurabhBlib 
{
	public static void datestr(String x) 
	{
//Dates are in mm/dd/yyyy
//Must make in to dd-mm-yyyy
		String a = x.substring (3,5);
		String b = x.substring (0,2);
		String c = x.substring (6);
			System.out.println ( a + "-" + b + "-" + c);
	}
	public static void sumupto(int x) 
	{
		int a = 0;
		int b = 0;
		while (b <= x)
		{
			a = a + b;
			b ++; 
		}
		return a;
		System.out.print(y);
	// The output is the number being added to 0, 1, 2, .... till the number itself.
	// Ex. x=3, output: 3,4,5,6
	}
	// You insert a numerical input and get the sum of the numbers 'till the input
	public static boolean isfactorial(int x)
	{
		int y=1;
		for (int i=1; i <= x; i++)
		{
			if(x==y)
			{
				return(true);
			}
			y=i*y;
		}
		return(false);
	}
	// Tells whether if the input is factorial
}

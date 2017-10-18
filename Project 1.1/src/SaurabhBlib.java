
public class SaurabhBlib 
{
	public static void datestr(String x) 
	{
//Dates are in mm/dd/yyyy
//Must make in to dd-mm-yyyy
		String a = x.substring (3,5);
		String b = x.substring (0,2);
		String c = x.substring (6,10);
			System.out.print ( a + "-" + b + "-" + c);
	}
	public static void sumupto(int x) 
	{
		int y = 0;
		for (int i=0; i <= 0; i++)
		{
			y = i + x;
		}
		System.out.print(y);
	}
	// You insert a numerical input and get the sum of the numbers 'til the input
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

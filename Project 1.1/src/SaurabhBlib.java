
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
		System.out.print (y);
	}
	public static void isfactorial(int x)
	{
		int y = 0;
		for (int i=0; i <= 0; i++)
		{
			y = i*y;
		}
		System.out.print (y);
	}
}

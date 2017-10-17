//wes avedisian
public class WesALib 
{
	public static boolean isPalindrome(String s) 
	{
		int a=s.length();
		int n=0; 
		while(n<=(a/2))
		{
			if(
				s.substring(n)
				==
				s.substring(a-n)
				)
			{
				n++;
			}
			else
			{
				return(false);
			}
		}
		return(true);
	}
	public static void isFibonnaci(int f)
	{
		if(f<0)
		{
			System.out.print("Not a Fibonacci");
		}
		else
		{
			int x=0;
			int y=1;
			int z=0;
			while(c<n)
			{
				x+y=z;
				x=y;
				y=z;
			}
			if(c==n)
			{
				System.out.print("Is a Fibonacci");
			}
			else
			{
				System.out.print("Not a Fibonacci");
			}
		}
		
	}
	public static void multiplacationTable(int m)
	{
		int i=1;
		for(int p=1, p<=m, p++)
		{
			for(i; i<=m; i++)
			{
				System.out.print(p*i);
			};
			System.out.println()
		}	
	}
}

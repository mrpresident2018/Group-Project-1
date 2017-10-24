//wes avedisian
public class WesALib 
{
	public static boolean isPalindrome(String s) 
	{
		int n = 0;
		int a = s.length();
		while(n<((a-1)/2)) 
		{
			if(
			   (s.substring(n,n+1)).equals(s.substring(a-n-1,a-n))==(false)
			  )
			{
				return(false);
			}
			n++;
		}
		return(true);
	}
	public static boolean isFibonnaci(int f)
	{
		if(f<0)
		{
			return(false);
		}
		else
		{
			int x=0;
			int y=1;
			int z=0;
			while(z<f)
			{
				z=x+y;
				x=y;
				y=z;
			}
			if(z==f)
			{
				return(true);
			}
			else
			{
				return(false);
			}
		}
		
	}
	public static void multiplacationTable(int m)
	{
		int i=1;
		int p=1;
		while(p<=m)
		{
			for(i=1; i<=m; i++)
			{
				System.out.print(p*i + " ");
			}
			p++;
			System.out.println();
		}	
	}
}

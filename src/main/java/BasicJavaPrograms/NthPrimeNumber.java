package BasicJavaPrograms;
import java.util.Scanner;

public class NthPrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position");
		int input1 = sc.nextInt();
		int n = 1, c = 0,i;
		while(c<input1)
		{
			n=n+1;
			for(i=2; i<=n; i++)
			{
				if(n%i==0)
					break;
			}
			if (i==n)
			{
				c=c+1;
			}
		}
		System.out.println("Prime number at position " +input1+ " is " + n);
	}
}

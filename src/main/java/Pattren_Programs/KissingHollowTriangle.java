package Pattren_Programs;

public class KissingHollowTriangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==1||i==n||j==1||j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{ 
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<n; j++)
			{
				if (i==1 || j==i || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

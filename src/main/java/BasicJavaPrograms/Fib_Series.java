package BasicJavaPrograms;

import java.util.Scanner;

public class Fib_Series {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("\n");

		int no1 = 0, no2 =1;
		int sum, res = 1;

		for(int i = 1; i<=num; i++)
		{
			sum = no1+no2;
			no1 = no2;
			no2 = sum;
			res=res+sum;
			System.out.print(" "+sum);
		}
		System.out.print("\n ");
		System.out.println("Sum of fib series is: "+res);

		sc.close();
	}
}

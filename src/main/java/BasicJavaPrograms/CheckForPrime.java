package BasicJavaPrograms;

import java.util.Scanner;

public class CheckForPrime {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nnumber you wante to check");
		int num = sc.nextInt();
		int temp=0;
	
		for(int i=2; i<=num-1; i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime");
		}
		sc.close();
	}
}

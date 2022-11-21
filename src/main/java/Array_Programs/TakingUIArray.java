package Array_Programs;

import java.util.Scanner;

public class TakingUIArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many friends do you have ");
		int lenght = sc.nextInt();

		String[] names = new String[lenght];

		//Reading the names from user
		for(int counter = 0; counter < lenght; counter++)
		{
			System.out.println("Enter the name of your friend " +(counter+1));
			names[counter] = sc.next();
		}

		//printing the names for output
		System.out.println("Your friends are ");
		for(int counter = 0; counter < lenght; counter++)
		{
			System.out.println( names[counter]);
		}
	}
}

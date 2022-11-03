package Array_Programs;

import java.util.Scanner;

public class Sum_Of_Ellements {

	public static void main(String[] args) 
	{
		int num[] = new int[6];
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter " + num.length + " integer values: ");

		for(int i=0; i<num.length; i++)
		{
			num[i]=sc.nextInt();
		}
		// Calculating the sum of input values.
		int sum = 0;
		for(int i = 0; i< num.length; i++){
			sum = sum + num[i];
		}
		
		// Displaying sum of input values entered by user.
	     System.out.println("Sum: " +sum);
	}

}

// Let’s take an example program where we will accept numbers as input from 
//the keyboard and calculate the sum and average of these numbers.


package Array_Programs;

import java.util.Scanner;

public class Sum_and_Avg {

	public static void main(String[] args)
	{
		int sum = 0;
		int avg = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers: ");
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		
		//enter the numbers
		for(int i =0; i<nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		//calculating the sum
		for(int i = 0; i<nums.length; i++)
		{
			sum = sum +nums[i];
		}
		System.out.println(sum);
		//calculating the avg
		for(int i = 0; i<nums.length; i++)
		{
			
			avg = sum/n;			
		}
		System.out.println(avg);

		
	
	}

}

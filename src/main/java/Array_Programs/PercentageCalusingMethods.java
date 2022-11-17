package Array_Programs;

import java.util.Scanner;

//Let’s create a program where we will accept the marks obtained by a student into a one-dimensional array
//from the keyboard and finds total marks and percentage of marks. Assume that the maximum mark in any subject is 100.

public class PercentageCalusingMethods 
{
	static int total = 0;

	public static void main(String[] args) 
	{

		//Getting nujmber of subjects
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many subjects you had");
		int n = sc.nextInt();
		//n = no of subjects
		//getting marks of each subjects
		int marks[] = new int[n];

		System.out.println("Enter the marks obtained in " +n+ " subjects");
		for(int i = 0; i<marks.length; i++)
		{
			marks[i] = sc.nextInt();
		}

		//calculating the total
		for(int i = 0; i<marks.length; i++)
		{
			total = marks[i] + total;
		}
		System.out.println("total marks: " +total);

		PercentageCalusingMethods d = new PercentageCalusingMethods();
		float b = d.percentage(n);
		System.out.println(b);
		}

	public float percentage(int un)
	{
		float percent = total/un;
		
		//System.out.println("Percentage is: " +percent);
		return percent;
	}
}
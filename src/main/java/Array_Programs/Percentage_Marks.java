//Let’s create a program where we will accept the marks obtained by a student into a one-dimensional array
//from the keyboard and finds total marks and percentage of marks. Assume that the maximum mark in any subject is 100.


package Array_Programs;
import java.util.Scanner;

public class Percentage_Marks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		// Ask in how many subjects have you given exams.
		System.out.println("In how many subjects have you given the exam: ");
		int n = sc.nextInt();

		// Create one-dimensional array with size n.
		int[] marks = new int[n];

		System.out.println("Enter your marks obtained in subjects:"); 
		// Store elements into the array using for loop.
		for(int i = 0; i < n; i++)
		{
			marks[i] = sc.nextInt();
		}
		
		// Find the total marks obtained in subjects.
		int total = 0;
		for(int i = 0; i < n; i++)
		{
			total = total + marks[i];
		}
		
		// Display the total marks on the console.
	     System.out.println("Total marks: " +total);
	     
	  // Find the percentage.
	     float percentange = total/n;
	     System.out.println("Percentage is: " +percentange);

	}
}

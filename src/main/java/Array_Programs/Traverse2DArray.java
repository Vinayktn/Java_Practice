package Array_Programs;

import java.util.Scanner;

public class Traverse2DArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of cols: ");
		int cols = sc.nextInt();

		int[][] marks = new int[rows][cols];
		System.out.println("Enter all the elements of the array: ");

		//Traversing through multi dimensional Array
		//rows
		for(int i = 0; i < rows; i++ )
		{
			//columns
			for(int j=0; j < cols; j++)
			{
				marks[i][j] = sc.nextInt();
			}
		}

		//		//Taking input elements from the user
		//		for(int j = 0; j < cols; j++ )
		//		{
		//			//columns
		//			for(int i=0; i < rows; i++)
		//			{
		//				marks[i][j] = sc.nextInt();
		//			}
		//		}

		//		//Transpose of a matrix
		//		for(int i=0; i<rows; i++)
		//		{
		//			for(int j=0; j<cols; j++)
		//			{
		//				System.out.print(marks[i][j]+ " ");
		//			}
		//			System.out.println();
		//		}


		//Printing the output of a mtrix
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the element x to search for: ");
		int x = sc.nextInt();
		
		//Searching for an element inside a array
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if (marks[i][j] == x)
				{
					System.out.println("Elemet found at locations "+ (+i+ "," +j));
				}
			}
		}
	}
}

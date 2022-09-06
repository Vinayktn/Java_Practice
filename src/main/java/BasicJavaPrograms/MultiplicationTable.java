package BasicJavaPrograms;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// Take the input from user and print the tables

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = s.nextInt();

		for (int i = 1; i <= no; i++)
		{
			System.out.println(no+ "*" +i +"=" +(no*i));
		}
	}

}

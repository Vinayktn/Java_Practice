package BasicJavaPrograms;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// Checking wether the number enterd by the user is even or odd using ternary operator

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int no1 = s.nextInt();
		String result = no1 % 2 == 0 ?  "Even  number": "Odd Number";
		System.out.println(result);
		s.close();
	}

}

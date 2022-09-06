package BasicJavaPrograms;
import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// Swap Without using third variable

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no1: ");
		int no1 = s.nextInt();

		System.out.println("Enter no2: ");
		int no2 = s.nextInt();

		no1 = no1 + no2;
		no2 = no1 - no2;
		no1 = no1 - no2;
		System.out.println("no1 : " +no1 );
		System.out.println("no2 : " +no2 );


	}

}

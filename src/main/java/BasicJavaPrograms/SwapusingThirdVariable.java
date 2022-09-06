package BasicJavaPrograms;
import java.util.Scanner;

public class SwapusingThirdVariable {

	public static void main(String[] args) {
		// Swap using third variable
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no1: ");
		int no1 = s.nextInt();
		
		System.out.println("Enter no2: ");
		int no2 = s.nextInt();
		
		int temp = no1;
		no1 = no2;
		no2 = temp;
		System.out.println(no1);
		System.out.println(no2);

	}

}

package BasicJavaPrograms;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// Taking input from user

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
 		String name=s.next();
			
		System.out.println("Enter your age:");
		int age = s.nextInt();
		
		System.out.println("Enter your Salary:");
		double salary = s.nextDouble();
		
		
		System.out.println("RCB will win this season:");
		boolean cup = s.hasNext();

		System.out.println("Your name is: "+name);
		System.out.println("Your age is: "+age);
		System.out.println("Your salary is: "+salary);
		System.out.println("Will RCB win the cup this season: "+cup);

	}

}



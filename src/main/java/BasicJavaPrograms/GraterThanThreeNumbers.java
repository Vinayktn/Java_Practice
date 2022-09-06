package BasicJavaPrograms;
import java.util.Scanner;

public class GraterThanThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no1");
		int no1 = s.nextInt();
		
		System.out.println("Enter no2");
		int no2 =  s.nextInt();
		
		System.out.println("Enter no3");
		int no3 =  s.nextInt();
		
		String result = (no1 > no2 && no1 > no3) ?  (no1+" is greater than " +no2+ " and " +no3) : 
		(no2 > no1 && no2 > no3) ? (no2+" is greater than " +no3+ " and " +no1):(no3+" is greater than " +no1+ " and " +no2);
		System.out.println(result);
	}

}

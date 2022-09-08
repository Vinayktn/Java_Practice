package BasicJavaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		int fact = 1;

		int i = no;
		while( i>=1 ){  
			fact = fact * i;   
			i--; //increment i by 1   
		}    
		System.out.println(fact);

		sc.close();
	}

}

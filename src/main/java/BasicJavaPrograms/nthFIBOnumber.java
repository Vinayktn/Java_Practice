package BasicJavaPrograms;

import java.util.Scanner;

public class nthFIBOnumber {

	static Scanner s = new Scanner(System.in);
	static int no1=0;
	static int no2=1;
	static int counter;
	static int fib_number;
	public static void main(String[] args)
	{
		System.out.println("Enter the position of which you need to check the fibonacci number: ");
		int Input_Position = s.nextInt();

		if(Input_Position==1)
		{
			fib_number=no1;
		}
		else if(Input_Position==2)
		{
			fib_number=no2;
		}
		else
		{
			counter=3;
			while(counter<=Input_Position)
			{
				fib_number = no1+no2;
				no1 = no2;
				no2 = fib_number;
				counter++;
			}
			System.out.println(fib_number);
		}
	}
}

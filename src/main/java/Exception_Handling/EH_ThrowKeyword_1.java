/*
You are required to compute the power of a number by implementing a calculator.
Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers, n and p, as parameters and finds n^p.
If either n or p is negative, then the method must throw an exception which says "n or p should not be negative".
Also, if both n and p are zero, then the method must throw an exception which says "n and p should not be zero"
*/

package Exception_Handling;

import java.util.Scanner;

 
class Calculator 
{
	public long power(int n, int p) throws Exception
	{
		if(n == 0 && p == 0)
			throw new Exception("n and p should not be zero.");
		else if(n < 0 || p < 0)
			throw new Exception("n or p should not be negative.");
		else
			return (long)(Math.pow(n,p));
	}
}

public class EH_ThrowKeyword_1 {
	final static Calculator my_calculator = new Calculator();
	 final static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in .hasNextInt())
		{
			int n = in .nextInt();
			int p = in .nextInt();

			try 
			{
				System.out.println(my_calculator.power(n, p));
			} 
			
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}
}

//PROLEM STATEMENT

//You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, 
//exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EH_TryCatchblock {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		try
		{   
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(x/y);
		}

		catch(InputMismatchException e )
		{
			System.out.println(e.getClass().getName());
		}

		catch(ArithmeticException e )
		{
			System.out.println(e.getClass().getName() + ": / by zero");
		}
	}
}

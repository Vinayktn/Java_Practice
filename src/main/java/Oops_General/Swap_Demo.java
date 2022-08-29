package Oops_General;

public class Swap_Demo
{
	static String emp1;
	static String emp2;

	Swap_Demo()
	{
		emp1 = "This is employee - 1";
		emp2 = "This is employee - 2";
	}

	void SwapEmployeeinfo( String x, String y)
	{
		String res;
		res = x;
		x = y;
		y = res;
		System.out.println("This is Employee - 1" + x);
		System.out.println("This is Employee - 2" + y);
	}
	public static void main(String[] args)
	{
		Swap_Demo obj = new Swap_Demo();
		System.out.println( );
		obj.SwapEmployeeinfo(emp1, emp2);
	}


}

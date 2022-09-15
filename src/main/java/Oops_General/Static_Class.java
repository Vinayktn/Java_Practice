package Oops_General;

public class Static_Class 
{
	int a;
	int b;
	public static class Static_Class_1
	{
		public static void m1()
		{
			System.out.println("static inner class-method");
		}
	}

	public static void main(String...args) 
	{
		//	Static_Class_1 obj = new Static_Class_1();
		Static_Class.Static_Class_1 obj1 = new Static_Class.Static_Class_1();
		obj1.m1();
	}
}

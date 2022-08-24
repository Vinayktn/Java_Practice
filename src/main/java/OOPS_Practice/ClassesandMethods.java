package OOPS_Practice;

public class ClassesandMethods {

	public static void main(String[] args) {
		//practice of classes and methods

		ClassesandMethods obj = new ClassesandMethods();
		obj.m2();

	}

	void m1()
	{
		System.out.println("This is M1 - method");

	}


	void m2()
	{
		System.out.println("This is M2 - method");
		m3();
	}



	void m3()
	{
		System.out.println("This is M3 - method");
		m1();
	}


	void m4()
	{
		System.out.println("This is M4 - method");

	}

}

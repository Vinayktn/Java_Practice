package Inheritance;

public class Inheritance_Practice1 
{
	int a1, b1;
	String sa;
	int i = 10;
	String s = "This is a parent class string";

	Inheritance_Practice1()
	{
		System.out.println("This is a parent class default constructor");
	}

	Inheritance_Practice1(int a, int b, String s1)
	{
		System.out.println("This is a parent class parameterized constructor");
		this.a1=a;
		this.b1=b;
		this.sa=s1;
	}

	void show()
	{
		System.out.println("Parent class method");
	}
}

class inheritance2 extends Inheritance_Practice1
{
	void show1()
	{
		System.out.println("Child class method");
	}
	public static void main(String[] args) 
	{
		inheritance2 obj = new inheritance2();
		System.out.println(obj.i);
		System.out.println(obj.s);
		obj.show();
		obj.show1();
	}
}

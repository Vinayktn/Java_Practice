package Oops_General;

class A1 
{
	void showA1() 
	{
		System.out.println("A class method");
	}
}
class B1 extends A1
{
	void showB1() 
	{
		System.out.println("B class method");
	}
	public static void main(String[] args)
	{
		A1 a = new A1();
		a.showA1();
	}
}

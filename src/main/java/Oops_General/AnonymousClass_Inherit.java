package Oops_General;

public class AnonymousClass_Inherit 
{
	public void display() 
	{
		System.out.println("Inside the Polygon class");
	}

}

class AnonymousDemo
{
	public void createClass()
	{
		// creation of anonymous class extending class AnonymousClass_Obj
		AnonymousClass_Inherit obj = new AnonymousClass_Inherit()
		{
			/*
			 * public void display() { System.out.println("Inside an anonymous class."); }
			 */
		};
		obj.display();
	}
}

class Main {
	public static void main(String[] args)
	{
		AnonymousDemo an = new AnonymousDemo();
		an.createClass();
	}
}
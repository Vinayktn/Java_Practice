package Inheritance;

public class Parent_Child_Reference
{
	void Arrange_Marriage()
	{
		System.out.println("Parents likes arrange marriages");
	}
}

class Child extends Parent_Child_Reference
{
	void Love_Marriage()
	{
		System.out.println("children likes love marriages");
	}

	public static void main(String[] args) 
	{
		Parent_Child_Reference vinay = new Child();
		vinay.Arrange_Marriage();
	}
}
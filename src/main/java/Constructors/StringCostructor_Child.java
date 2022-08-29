package Constructors;

public class StringCostructor_Child extends StringCostructor_Parent
{
	public StringCostructor_Child()
	{
		System.out.println("Child class constructor");
		b = "String from child class";
	}

	public static void main (String...args)
	{
		StringCostructor_Child obj = new StringCostructor_Child();
		String s = obj.a;
		System.out.println(s);
	}
}

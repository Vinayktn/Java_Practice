package OOPS_Practice;
//This is an example of HAS-A relationship
//HAS-A relationship is also called as ASSOCIATION
//HAS-A relationship are of two types
//Types of Association: 2 types
//1. Aggregation (Weak association)
//2. Composition (Strong association)


class Engine
{
	void start ()
	{
		System.out.println("Engine starts");
	}
}
public class Car 
{
	public static void main(String[] args)
	{
		Engine obj = new Engine();
		obj.start();
	}

}

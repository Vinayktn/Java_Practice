package Oops_General;

interface polygon
{
	public void display();
}

public class AnonymousClass_Interface 
{
	public void createclass()
	{
		polygon p = new polygon() 
		{
			public void display() 
			{
				System.out.println("This is from the interface");
			}
		};
		p.display();
	}
}

class Main1 
{
	public static void main(String[] args)
	{
		AnonymousClass_Interface an = new AnonymousClass_Interface();
		an.createclass();
	}
}
package Oops_General;

public class This_Keyword 
{
	int x;
	int y;

	public This_Keyword()
	{
		this("vinay");
		System.out.println("This is a default constructor");
	}


	public This_Keyword(String name)
	{
		this(3,6);
		System.out.println("this is a string " + name);
	}

	public This_Keyword(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	public void add()
	{
		int z = x + y;
		System.out.println(z);
	}

	public static void main(String[] args) 
	{
		This_Keyword obj = new This_Keyword();
		obj.add();
	}

}

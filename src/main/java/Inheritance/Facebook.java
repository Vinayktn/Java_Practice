package Inheritance;

class Facebook
{
	void show()
	{
		System.out.println("Facebook is the main parent");
	}
}

class Watsapp extends Facebook
{
	void show1()
	{
		System.out.println("Watsapp class is extending the properties from facebook");
	}
}

class Instagram extends Watsapp
{

	void show2()
	{
		System.out.println("Instagram class is extending the properties from both watsapp and facebook");
	}

	public static void main(String[] args)
	{
		Watsapp obj = new Watsapp();
		obj.show();
		obj.show1();
	}
}




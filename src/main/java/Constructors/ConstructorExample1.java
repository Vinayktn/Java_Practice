package Constructors;

public class ConstructorExample1
{

	int age;
	int legs;
	String color;

	ConstructorExample1(int age1, int legs1, String color1)
	{
		this.age=age1;
		this.legs=legs1;
		this.color=color1;
	}

	void properties()
	{
		System.out.println("Age: " +age+ "\nLegs: " +legs+ "\nColor: " +color+"\n");		
	}


	final static synchronized strictfp public void main(String... vinay) 
	{
		ConstructorExample1 buzo = new ConstructorExample1(3, 10, "white");
		buzo.properties();
	}

}

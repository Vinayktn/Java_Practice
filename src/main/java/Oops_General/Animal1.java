package Oops_General;

public class Animal1 
{
	int age;
	int legs = 4;
	String color;

	void run(String name, int km)
	{

		System.out.println(name+ " runs " +km+ " kilometers\n");
	}

	void properties()
	{
		System.out.println("Age: " +age+ "\nLegs: " +legs+ "\nColor: " +color);		
	}


	public static void main(String[] args) 
	{
		Animal1 buzo = new Animal1();
		buzo.run("Buzo", 5);
		buzo.age = 5;
		buzo.color = "White";
		buzo.legs=4;
		buzo.properties();

		Animal1 cat = new Animal1();
		cat.age = 4;
		cat.color = "Brown";
		cat.properties();
	}


}

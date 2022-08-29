package Oops_General;

public class Animal 
{

	int age = 10;
	int legs = 4;
	String color = "white";
	
	void run(String name, int km)
	{
		System.out.println(name+ " runs " +km+ " kilometers");
	}
	
	
	void properties()
	{
		System.out.println("Age: " +age+ "\nLegs: " +legs+ "\nColor: " +color);
	}
	
	
	public static void main(String[] args) 
	{
		Animal chintu = new Animal();
		chintu.run("Chintu", 10);
		chintu.properties();
	}

}

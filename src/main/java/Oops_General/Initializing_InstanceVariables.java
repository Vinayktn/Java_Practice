package Oops_General;
class Initializing_InstanceVariables 
{
	int lenght;
	int breadth;

	/* initializing the instance variables using constructor
	 * AccessModifiers_Practice() { Length = 10; breadth = 20; }
	 */

	//initializing using constructor
	Initializing_InstanceVariables(){
		lenght = 60;
		breadth=90;
	}

	//Initializing using methods
	void sum(int a, int b)
	{
		lenght = a;
		breadth = b;
	}

	void perimeter()
	{
		int perimeter = 2*(lenght + breadth); 
		System.out.println("Perimeter of the Rectangle: " +perimeter); 
	}

	public static void main(String[] args) 
	{
		Initializing_InstanceVariables obj = new Initializing_InstanceVariables();
		System.out.println(obj.breadth);
		obj.sum(10, 20);
		obj.perimeter();
	}
}
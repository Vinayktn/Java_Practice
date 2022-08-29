package Constructors;

public class ConstructorDemo 
{
	int height, width, depth;

	ConstructorDemo()
	{
		height = 10;
		width = 5;
		depth = 6;
	}


	ConstructorDemo(int a, int b, int c)
	{
		height = a;
		width = b;
		depth = c;
	}

	double vloume()
	{
		return height * width * depth;
	}

	public static void main(String[] args)
	{
		ConstructorDemo cuboid = new ConstructorDemo();
		double volume = cuboid.vloume();
		System.out.println(volume);

		ConstructorDemo cuboid1 = new ConstructorDemo(10,5,3);
		double volume1 = cuboid1.vloume();
		System.out.println(volume1);
	}
}
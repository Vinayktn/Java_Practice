package Inheritance;

public class Inheritance_Practice
{
	void show1()
	{
		System.out.println("this is class - Parent");
	}
}

class practice extends Inheritance_Practice
{
	void show2()
	{
		System.out.println("this is class - Child");
	}
public static void main(String[] args) 
{
	practice p = new practice();
	System.out.println();
	
}
}




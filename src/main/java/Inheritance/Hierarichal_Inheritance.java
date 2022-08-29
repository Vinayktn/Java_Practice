package Inheritance;

public class Hierarichal_Inheritance
{
	int a, b, c;
	String s1, s2;

	Hierarichal_Inheritance()
	{
		System.out.println(" This is a 1st class constructor");
	}

	void add()
	{
		a = 10;
		b = 12;
		c = a + b;
		System.out.println(c);
	}
}

class DesiredClass extends Hierarichal_Inheritance
{
	int c, d;
	String s3, s4;

	DesiredClass()
	{
		System.out.println(" This is a 2nd class constructor");
	}

	void sub()
	{
		a=10;
		b=12;
		c = a - b;
		System.out.println(c);
	}
}

class objclass extends Hierarichal_Inheritance
{
	int e, f;
	String s5, s6;

	objclass()
	{
		System.out.println(" This is a 3rd class constructor");
	}

	void multiply()
	{
		a=10;
		b=12;
		c = a * b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Hierarichal_Inheritance h = new Hierarichal_Inheritance();
		System.out.println(h.s1);
		System.out.println(h.s2);
		System.out.println(h.a);
		System.out.println(h.b);
		System.out.println(h.c);
		h.add();

		DesiredClass d = new DesiredClass();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);
		System.out.println(d.s1);
		System.out.println(d.s2);
		System.out.println(d.s3);
		System.out.println(d.s4);
		d.add();
		d.sub();

		objclass ob = new objclass();
		System.out.println(ob.a);
		System.out.println(ob.b);

		System.out.println(ob.c);
		System.out.println(ob.e);
		System.out.println(ob.f);
		System.out.println(ob.s1);
		System.out.println(ob.s2);
		System.out.println(ob.s5);
		System.out.println(ob.s6);
		ob.add();
		ob.multiply();		
	}
}
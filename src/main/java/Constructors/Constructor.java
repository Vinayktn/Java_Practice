package Constructors;

public class Constructor {
	int i;
	String s;
	Constructor(int i, String s)
	{
		System.out.println("default constructor");
		this.i = i;
		this.s = s;
		System.out.println(i);
		System.out.println(s);

	}
	public static void main(String[] args) {
		Constructor c = new Constructor(3, "vinay");
 
	}

}

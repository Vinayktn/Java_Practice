package Constructors;

public class COnstructor {
	int i;
	String s;
	COnstructor(int i, String s)
	{
		System.out.println("default constructor");
		this.i = i;
		this.s = s;
		System.out.println(i);
		System.out.println(s);

	}
	public static void main(String[] args) {
		COnstructor c = new COnstructor(3, "vinay");
 
	}

}

package Constructors;

public class Super_Constructor2 extends Super_Constructor1 {

	Super_Constructor2() {
		System.out.println("This is child class constructor");
	}
	Super_Constructor2(String name) {
		super(name);
		System.out.println("This is child class parameterized constructor " + name);
	}

	public static void main(String[] args) {
		Super_Constructor2 obj1 = new Super_Constructor2("vinay");
	}
}

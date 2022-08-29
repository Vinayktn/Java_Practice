package Oops_General;

import java.util.Scanner;

public class Object_Pass_Return {
	int lenght, breadth, area;
	
	Object_Pass_Return()
	{
	System.out.println("uiguh");
	}
	
	Object_Pass_Return area1( )
	{
		 Object_Pass_Return	object1 = new Object_Pass_Return();
		object1.lenght = this.lenght;
		object1.breadth = this.breadth;
		object1.area = object1.lenght * object1.breadth;
		return object1;
	}

	Object_Pass_Return area2(  )
	{
		Object_Pass_Return object2 = new Object_Pass_Return();
		object2.lenght = this.lenght + 5;
		object2.breadth = this.breadth + 6;
		object2.area = object2.lenght * object2.breadth;
		return object2;
	}

	public static void main(String[] args)
	{
		Object_Pass_Return obj = new Object_Pass_Return();
		//obj.Object_Pass_Return();
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the lenght:  ");
		obj.lenght = s.nextInt();
		System.out.println("Enter the breadth:  ");
		obj.breadth = s.nextInt();
		Object_Pass_Return a = obj.area1();
		Object_Pass_Return b = obj.area2();
		System.out.println(a.area);
		System.out.println(b.area);
	}

}

package Oops_General;

public class Cloning {

	int i;
	int j;
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		//Shallow copy: 
		//we are not creating two objects instead we are only creating one object 
		//in the heap memory and there will be two references in the stack memory
		
		abc obj = new abc();
		obj.i=5;
		obj.j=6;
		System.out.println("i=" + obj.i+ " and " + "j=" + obj.j);

		abc obj1 = obj;
		obj1.i = 3;
		obj1.j = 4;
		System.out.println("i=" + obj1.i+ " and " + "j=" + obj1.j);
		System.out.println("i=" + obj.i+ " and " + "j=" + obj.j);
		
		//Deep Copy:
		//problem with deep copy is when we have so many variables to copy	
		abc obj2 = new abc();
		obj2.i=obj.i;
		obj2.j=obj.j;
		
		obj2.i=10;
		obj2.j=11;
		System.out.println("=========================");
		System.out.println(" ");
		System.out.println("i=" + obj.i+ " and " + "j=" + obj.j);
		System.out.println("i=" + obj2.i+ " and " + "j=" + obj2.j);
		System.out.println(" ");

		//Clone:
		abc obj3 = (abc)obj.clone();
		System.out.println("=========================");
		System.out.println(" ");
		System.out.println("i=" + obj3.i+ " and " + "j=" + obj3.j);
		obj3.i=33;
		obj3.j=98;
		System.out.println("i=" + obj3.i+ " and " + "j=" + obj3.j);
		System.out.println("i=" + obj.i+ " and " + "j=" + obj.j);
	}

}

class abc implements Cloneable
{
	int i;
	int j;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
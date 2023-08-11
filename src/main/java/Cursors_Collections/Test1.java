package Cursors_Collections;

import java.util.ArrayList;

public class Test1 
{
	String name;
	int id;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+ ", " +id;
	}
	public static void main(String[] args)
	{
		//		Test1 t1 = new Test1();
		//		t1.name="prashanth";
		//		t1.id=101;
		//		System.out.println(t1);
		//
		//

		//cursors
		//enumeration - legacy classes - stack and vector - read 
		//iterator - all classes - all collectons - read, remove
		//listiterator -  all classes - all collectons - read, insert, remove and replace
		
		ArrayList al = new ArrayList();
		al.add("aaa");

		al.add("bbb");

		al.add("ccc");

		al.add("ddd");

		System.out.println(al);


	}
}

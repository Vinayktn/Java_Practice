package Collections_Practice;

import java.util.Iterator;
import java.util.Vector;

public class Vector_Practice {

	public static void main(String[] args) {
		Vector v = new Vector();

		//addelement() used to  add single heterogenous elements
		v.addElement(10);
		v.addElement("vinay");
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		System.out.println(v);

		//removeelement() method is used to remove the specified element
		v.removeElement("vinay");
		System.out.println(v);

		//removeelements() method is used to remove all the elements in the vector
		//v.removeAllElements();
		//System.out.println(v);

		//addelemet() at the specified index position
		v.add(1, 20);
		System.out.println(v);

		//capacity to check  the current capacity of the vector
		System.out.println(v.capacity());

		//can retrive the first element
		System.out.println(v.firstElement());

		//can retrive the last element
		System.out.println(v.lastElement());

		//removeelemet() retruns boolen value after removing
		System.out.println(v.removeElement(50));
		System.out.println(v);
 		
		//retrieval can be done in 3 ways for loop||foreach loop||iterator method
		//1. using for loop
		//		for(int i=0; i<20; i++)
		//		{
		//			v.addElement(i);
		//		}
		//		System.out.println(v);
		//	}

		//2. using foreach loop
		//		for(Object obj:v)
		//		{
		//			System.out.print(obj+ "  ");
		//		}

		//3. using iterator() method
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
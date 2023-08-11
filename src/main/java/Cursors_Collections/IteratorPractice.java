package Cursors_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class IteratorPractice
{
	public static void main(String[] args) 
	{
		LinkedList l1= new LinkedList ();
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		LinkedList l2= new LinkedList ();
		
 
		//	System.out.println(l1);
		
		Iterator i1 = l1.iterator();
		while(i1.hasNext())
		{
			int element = (int) i1.next();
			if(element==40)
			{
				i1.remove();
			}
			else
			{
				l2.add(element);
			}
		}
		System.out.println(l2);
 	}
}

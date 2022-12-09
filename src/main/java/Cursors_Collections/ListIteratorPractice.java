package Cursors_Collections;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.lang.model.element.Element;

public class ListIteratorPractice 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("sunil");
		a1.add("harsha");
		a1.add("vinay");
		System.out.println(a1);
		ListIterator l1 = a1.listIterator();
		ListIterator l2 = a1.listIterator();

		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("_________________________________________________");
		while(l1.hasPrevious())
		{
			String element = (String) l1.previous();
			if(element=="sunil")
			{
				l1.set("karthik");
			}
			else
			{
				System.out.println(element);
			}
		}
		
	
	}
}
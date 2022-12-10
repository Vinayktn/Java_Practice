package Collections_Practice;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_Practice {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet();

		//Does not allow heterogenous objects
		ts.add("aaa");
		ts.add("bbb");
		ts.add("eee");
		ts.add("ggg");
		//ts.add(20);
		System.out.println(ts);

		System.out.println(ts.ceiling("ddd"));
		System.out.println(ts.floor("hhh"));

		//descendingset() method is used to sort in descending order
		System.out.println(ts.descendingSet());

		//retrieving the first element in the set
		System.out.println(ts.first());

		System.out.println(ts.headSet("eee"));

		//returns the next higher element to the provided object
		//if there is no greater element than the object provided it will return NULL value
		System.out.println(ts.higher("ggg"));

		//retrieves and removes the first element if the element is not present then it return the NULL value
		ts.pollFirst();
		System.out.println(ts);

		//retrieves and removes the last element if the element is not present then it return the NULL value
		ts.pollLast();
		System.out.println(ts);

		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		for(String str: ts)
		{
			System.out.println(str);
		}
	}
}
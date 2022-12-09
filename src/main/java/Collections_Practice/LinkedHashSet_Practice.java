package Collections_Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Practice {

	public static void main(String[] args) {

		//Since set is an interface we cannot instantiate it so we creating the object of hasset and giving the reference of set
		Set<String> ss = new HashSet();
		ss.add("vinay");
		ss.add("harsha");
		ss.add("aditya");
		ss.add("sunil");
		ss.add("pravi");

		//this preserves the insertion order unlike hashset thats the main diff between them
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(60);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(40);
		System.out.println(hs);


		//getting the hashcode of the object using hashcode() method
		System.out.println(hs.hashCode());

		//adding the entire collect using the addall() method
		System.out.println(hs.addAll(ss));

		System.out.println(hs);

		//containsall() method returns in boolean value (checking the presence of the entire collection)
		System.out.println(hs.containsAll(ss));

		//we can retrieve the class name of the object using getclass() method
		System.out.println(hs.getClass());

		//checking the presence of single object using contains() method
		System.out.println(hs.contains("vinay"));

		//checking the collection is empty or not using the isempty() method
		System.out.println(ss.isEmpty());

		//removing one collection within another collecttion using removeall() method
		//	hs.removeAll(ss);
		System.out.println(hs);

		//traversing the values using iterator
		//		Iterator it = ss.iterator();
		//		Iterator hs1 = hs.iterator();
		//		while(it.hasNext())
		//		{
		//			System.out.println(it.next());
		//		}
		//
		//		while(hs1.hasNext())
		//		{
		//			System.out.println(hs1.next());
		//		}
		System.out.println("============================================================");

		//traversing the values using for loop
		for(String str:ss)
		{
			System.out.println(str);
		}

	}

}

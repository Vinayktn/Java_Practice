package Collections_Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Practice {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();

		//adding values using collection method which return boolean value
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("vinay");

		//adding the element at required index using the list interface add method method
		al.add(4, "Aditya");
		//below code will return true as boolen output
	//	System.out.println(al.add(40));

		//printing the arraylist to see the values in it
		//System.out.println("Array List-1: " +al);

		ArrayList al2 = new ArrayList();
		//adding values using collection method which return boolean value
		al2.add(40);
		al2.add(50);
		al2.add("Harsha");
	//	System.out.println("Array List-2: " +al2);

		//adding the whole collection to the above array list-2 using collection interface method
		al2.addAll(al);
	//	System.out.println("Array List-2: " +al2);

		//adding the whole collection to the above array list-1 using List interface method at required index
		al.addAll(al2);
	//	System.out.println("Array List-1: " +al);

		//adding the entire collection of arraylist2 to arraylist1 at specific index using list interface method
		al.addAll(0, al2);	
		//System.out.println();
		//System.out.println("Array List-1: " +al);
		
		//remove method of collection interface
		al2.remove("Aditya");
		//System.out.println("Array List-2: " +al2);
		
		//remove method of List interface: removes element at specific index
		al2.remove(2);
		al2.remove("vinay");
		//System.out.println("Array List-2: " +al2);
		//System.out.println();

		//removeall method which removes all the elements of one collection from the other collection
		al.removeAll(al2);
		//System.out.println("Array List-1: " +al);
		
		//removeif method from collection interface (Should learn)
		
 		System.out.println("Array List-1: " +al);
		System.out.println();
 		System.out.println("Array List-2: " +al2);

 		//retain all method which retains values of arguented collection and removes all the other values from the collection
 		//al2.retainAll(al);
 		
 		//using get and set methods of list interface
 		
 		//returns the value at the specified index
 		System.out.println("value at the index position 1 is: " +al.get(1));
 		
 		//set method replaces the value at the given index
 		al.set(4, "Amma");
		System.out.println();
 		System.out.println("Array List-1: " +al);
 		
 		//indexof and lastindex of methods
		System.out.println("=================================================================================");
 		System.out.println("Array List-1: " +al);
		System.out.println();
 		System.out.println("Array List-2: " +al2);
		System.out.println();
 		System.out.println("Index of method fetching the value from the start: " +al.indexOf("vinay"));
 		System.out.println("LastIndex of method fetching the value from the end: " +al.lastIndexOf("ss"));

 		//contains method checking wether the value is there or not returns boolean 
 		System.out.println(al.contains("Harsha"));
 		
 		////contains all method checking wether the entire collection is there or not returns boolean
 		System.out.println(al.containsAll(al2));
 		
 		//equals method checking wether the collection is equal to other or not returns in boolean
 		System.out.println(al.equals(al2));

 		//size method checking the size returns integer
 		System.out.println("size of arraylist-1: " +al.size());
 		System.out.println("size of arraylist-2: " +al2.size());

 		//clear method will clear the entire collection
 		//al.clear();
 		
 		//isempty method checking whether the list/collection is empty or not
 		System.out.println(al.isEmpty());
 		
 		//converting arraylist to an array
 		// Object[] obj = al.toArray();
// 		 
// 		 for(int i=0; i<obj.length; i++)
// 		 {
// 			 System.out.println(obj[i]);
// 		 }
 		System.out.println("=================================================================================");
 		System.out.println("Array List-1: " +al);
		System.out.println();
 		System.out.println("Array List-2: " +al2);
 		
 		 //reading elements from an arraylist: 3 ways - for loop, for_each loop and iterator method
 		
 		//1. using for loop
// 		for(int i=0; i<al.size(); i++)
// 		{
// 			System.out.print(al.get(i)+" ");
// 		}
// 		
 		//2. using for each loop
// 		for(Object obj:al2)
// 		{
// 			System.out.println(obj);
// 		}
// 		
 		//3.using iterator() method
 		Iterator it = al.iterator();
 		while(it.hasNext())
 		{
 			System.out.println(it.next());
 		}
	}
}
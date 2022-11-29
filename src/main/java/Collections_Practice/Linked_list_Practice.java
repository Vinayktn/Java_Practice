package Collections_Practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list_Practice 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add("vinay");
		ll.add(30);
		ll.add(null);
		ll.add(true);
		System.out.println("First List : " +ll);

		LinkedList l2 = new LinkedList();
		//addall() method to add 1 collection to other
		l2.addAll(ll);
		System.out.println("Second List : " +l2);

		//addfirst () method to add the element at the 1st place
		l2.addFirst(100);
		System.out.println(l2);

		//adlast() method to add the element at the last place
		l2.addLast(200);
		System.out.println(l2);

		//removefirst() and removelast() method to remove the elemet from the first and last positions
		l2.removeFirst();
		l2.removeLast();
		System.out.println(l2);

		//simple add and remove methods add(obj) and remove(obj) methods
		l2.remove(true);
		l2.remove(null);
		l2.remove("vinay");
		l2.add(20);
		l2.add(5);
		l2.add(90);
		System.out.println("Before Sorting: " +l2);

		//sorting() using the collections class utility methods
		Collections.sort(l2);
		System.out.println("After Sorting: " +l2);

		//sorting in reverse order
		//		Collections.sort(l2, Collections.reverseOrder());
		//		System.out.println("Reverse order sorting result: " +l2);

		//shuffle method to shuffle the values in random order
		//		Collections.shuffle(l2);
		//		System.out.println("After shuffling: " +l2);

		//get() method to get the particular elements from the index
		System.out.println(l2.get(3));

		//set() method to set the value at the specified index
		l2.set(3, 10);
		System.out.println(l2);

		//contains() method to check wether linkedlist contains the value or not
		System.out.println(l2.contains(10));
		
		//containsall() method to check wether linkedlist contains the entire other collection or not
		System.out.println(l2.containsAll(ll));
		

		//contains() method to check wether linkedlist contains the value or not
		System.out.println(l2.contains(10));
		
		//retrieving values of Linkedlist
		//3 ways for loop, foreach loop, iterator()
//		for(int i=0; i<l2.size(); i++)
//		{
//			System.out.print(l2.get(i)+ "  ");
//		}
		
 		
// 		//2. using for each loop
// 		for(Object obj:l2)
// 		{
// 			System.out.print(obj+ "  ");
// 		}
		
		//using iterator method
		Iterator it = l2.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+ "  ");
		}
	}
}
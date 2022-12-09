package Collections_Practice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet_Practice
{
	public static void main(String[] args)
	{
		NavigableSet ss=new TreeSet();

		ss.add("aaa");
		ss.add("bbb");
		ss.add("ddd");
		ss.add("eee");
		ss.add("ggg");

		//gives the output in descending order: //[eee, ddd, ccc, bbb, aaa]
		System.out.println(ss.descendingSet());

		//if the element is present it will return the same element
		//otherwise it ill search for the next element of that and returns the same: example below output is: ddd
		System.out.println(ss.ceiling("ccc"));

		//it will return null if we are giving any value whicch is not there in the collection or if any middle value is missing 
		//and the next value is present then it will give the output of that next value as higher which is present in the set
		System.out.println(ss.higher("ccc"));

		//returns the last value in the set
		System.out.println(ss.floor("q"));

		//retunrs the nadjacent lower value 
		System.out.println(ss.lower("ccc"));

		//returns the first value
		System.out.println(ss.pollFirst());

		//returns the last value
		System.out.println(ss.pollLast());
	}
}
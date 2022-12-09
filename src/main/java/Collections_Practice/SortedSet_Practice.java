package Collections_Practice;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Practice 
{
	public static void main(String[] args)
	{
		//Since Sortedset is an interface we cannot instantiate it so we creating the object of Treeset and giving the reference of Sortedset
		SortedSet ss=new TreeSet();
		ss.add("aaa");
		ss.add("bbb");
		ss.add("ccc");
		ss.add("ddd");
		ss.add("eee");

		System.out.println(ss);
		System.out.println(ss.first());       //aaa
		System.out.println(ss.last());          //eee
		System.out.println(ss.headSet("ccc"));    //[aaa, bbb] - does not include itself
		System.out.println(ss.tailSet("ccc"));    //[ccc, ddd, eee] - include the provided object also
		System.out.println(ss.subSet("bbb", "eee"));    //[bbb, ccc, ddd]
	}
}

package Collections_Practice;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator_Chanllenge
{
	public static void main(String[] args) 
	{
		TreeSet tt=new TreeSet(new Mysort());
		tt.add("A");
		tt.add("BB");
		tt.add("AAA");
		tt.add("B");
		tt.add("AA");
		tt.add("BBB");
		tt.add("AAAA");
		System.out.println(tt);
	}
}

class Mysort implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1>len2)
		{
			return 1;
		}
		else if(len1<len2)
		{
			return -1;
		}
		else
		{
			return s1.compareTo(s2);
		}
	}
}
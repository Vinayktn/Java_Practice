package Collections_Practice;

import java.util.TreeSet;

class Student1 implements Comparable
{
	int rollno;
	String name;
	Student1(int rollno, String name)
	{
		this.name=name;
		this.rollno=rollno;
	}

	@Override
	public int compareTo(Object o)
	{
		Student1 st1=(Student1) o;
		Integer i1 = new Integer(this.rollno);
		Integer i2 = new Integer(st1.rollno);
		int val = i1.compareTo(i2);
		return -val;
	}

	@Override
	public String toString() 
	{
		return name+ " "+ rollno;
	}
}

public class Comparable_Practice1 {

	public static void main(String[] args)
	{
		Student1 s1 = new Student1(100, "vinay");
		Student1 s2 = new Student1(101, "harsha");
		Student1 s3 = new Student1(102, "aditya");
		Student1 s4 = new Student1(103, "bobby");
		Student1 s5 = new Student1(104, "sachin");

		TreeSet ts = new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		System.out.println(ts);
	}
}

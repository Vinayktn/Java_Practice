package Collections_Practice;
import java.util.Comparator;
import java.util.TreeSet;

class Teacher
{
	int rollno;
	String name;

	Teacher(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}

	@Override
	public String toString()
	{
		return rollno+"-"+name;
	}
}

class SortByName implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		Teacher vt = (Teacher) o1;
		Teacher vq= (Teacher) o2;
		int i = vt.name.compareTo(vq.name);
		return i;
	}	
}

class SortByRollNo implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		Teacher vt = (Teacher) o1;
		Teacher vq= (Teacher) o2;
		Integer i1 = new Integer(vt.rollno);
		Integer i2 = new Integer(vq.rollno);
		int i = i1.compareTo(i2);
		return i;
	}	
}

public class Comparaor_Practice
{
	public static void main(String[] args)
	{
		Teacher t1 = new Teacher(100, "vinay");
		Teacher t2 = new Teacher(101, "harsha");
		Teacher t3 = new Teacher(102, "aditya");
		Teacher t4 = new Teacher(103, "bobby");
		Teacher t5 = new Teacher(104, "sachin");

		TreeSet tt=new TreeSet(new SortByName());
		tt.add(t1);
		tt.add(t2);
		tt.add(t3);
		tt.add(t4);
		tt.add(t5);
		System.out.println(tt);

		TreeSet ts=new TreeSet(new SortByRollNo());
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		ts.add(t5);
		System.out.println(ts);
	}
}

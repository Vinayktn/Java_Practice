package Collections_Practice;
import java.util.TreeSet;

class Student implements Comparable
{
	int rollno;
	String name;
	Student(int rollno, String name)
	{
		this.name=name;
		this.rollno=rollno;
	}

	@Override
	public int compareTo(Object o)
	{
		Student st=(Student) o;
		int i=this.name.compareTo(st.name);
		return i;
	}

	@Override
	public String toString() 
	{
		return name+ " "+ rollno;
	}
}

public class Comparable_Practice 
{
	public static void main(String[] args)
	{
		Student s1 = new Student(100, "vinay");
		Student s2 = new Student(101, "harsha");
		Student s3 = new Student(102, "aditya");
		Student s4 = new Student(103, "bobby");
		Student s5 = new Student(104, "sachin");

		TreeSet ts = new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		System.out.println(ts);
	}
}
package SetandGet;

public class Student1_GetterandSetter 
{
	private int rollnumber;
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		if (name==null)
		{
			throw new IllegalArgumentException();
		}
		this.name=name;
	}
	
	public int getRollNumber()
	{
		return rollnumber;	
	}
	
	public void setRollNumber(int rollnumber)
	{
		try {
		if (rollnumber<=0)
		{
			throw new IllegalArgumentException("Cannot give the value less than zero");
		}
		this.rollnumber=rollnumber;
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.rollnumber);

	}
}

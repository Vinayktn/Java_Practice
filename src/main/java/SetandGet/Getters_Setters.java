package SetandGet;

import java.util.Scanner;

public class Getters_Setters 
{

	private int salary;
	private String name;

	public int getSalary() 
	{
		return salary;
	}

	public void setSalary(int salary) 
	{
		if(salary > 100000 ||  salary <= 0)   
		{  
			throw new IllegalArgumentException();	
		}  
		this.salary = salary;	
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		if(name == null ||  name.length() <= 0)   
		{  
			throw new IllegalArgumentException();  
		}  
		this.name = name;
	}  
}

class verify 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String	Nam = sc.nextLine();

		System.out.println("Enter Salary");
		int	Sal = sc.nextInt();

		Getters_Setters obj = new Getters_Setters();
		obj.setName(Nam);
		obj.setSalary(Sal);

		System.out.println(obj.getName() + " has " + obj.getSalary() + ".rs Salary" );
	}

}

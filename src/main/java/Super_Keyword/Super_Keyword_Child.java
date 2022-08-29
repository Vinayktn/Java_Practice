package Super_Keyword;

public class Super_Keyword_Child extends Super_Keyword_Parent {

	int salary=90000;
	String empname="vinay kumar tn";

	public void empname()
	{
		System.out.println("The employee name is " +super.empname);
	}

	public void empsal()
	{
		System.out.println("The employee salary is " +super.salary);
	} 

	public Super_Keyword_Child()
	{
		System.out.println("This is a child class default constructor");
	}
	
	public static void main(String[] args) 
	{
		Super_Keyword_Child obj = new Super_Keyword_Child();
		obj.empname();
		obj.empsal();
	}

}

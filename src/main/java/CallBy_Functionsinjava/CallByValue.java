package CallBy_Functionsinjava;

public class CallByValue 
{
	public static void main(String[] args) 
	{
		int n = 123;
		System.out.println("the value is: " +n);
		CallByValue c = new CallByValue();
		c.CalByValue1(n);
	}

	public void CalByValue1(int n)
	{
		System.out.println("the value is: " +n);
		n = 100;
		System.out.println("the value is: " +n);
	}
}

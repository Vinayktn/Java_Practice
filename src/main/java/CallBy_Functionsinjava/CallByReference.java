package CallBy_Functionsinjava;

public class CallByReference 
{
	public static void main(String[] args)
	{
		int[] numbers = {10, 20, 40, 50};
		System.out.println(numbers[3]);
		CallByReference c = new CallByReference();
		c.CallByReference1(numbers);
		System.out.println(numbers[3]);
	}

	public void CallByReference1(int[] val)
	{
		System.out.println(val[3]);
		val[3] = 200;
		System.out.println(val[3]);
	}
}

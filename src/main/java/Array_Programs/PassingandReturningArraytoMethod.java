package Array_Programs;

public class PassingandReturningArraytoMethod 
{
	public static void main(String[] args)
	{
		int[] marks = {90, 87, 67};
		display(marks);
		int[] revmarks;
		revmarks = reverseArray(marks);
		System.out.println("Reversed array elements are: ");
		display(revmarks);
	}

	public static void display(int[] input)
	{
		for(int counter = 0; counter < input.length; counter++)
		{
			System.out.println(input[counter]);
		}
	}

	public static int[] reverseArray(int[] num)
	{
		int[] reverse = new int[num.length];

		for(int i=0, j = reverse.length - 1; i < num.length; i++, j--)
		{
			reverse[j] = num[i];
		}
		return reverse;
	}

}

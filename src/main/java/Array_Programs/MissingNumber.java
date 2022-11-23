package Array_Programs;

public class MissingNumber 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int[] a = {2, 4, 1, 3, 6, 7, 8};
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}

		System.out.println("The missing number is: " +(missingnumber(a, a.length+1) - sum));
	}

	public static int missingnumber(int[] a, int n)
	{
		int sum1 = n*(n+1)/2;
		return sum1;
	}
}

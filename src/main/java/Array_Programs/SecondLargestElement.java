package Array_Programs;

import java.util.Arrays;

public class SecondLargestElement 
{
	public static void main(String[] args)
	{
		int[] a = {12, 12, 12, 3, 4, 3, 5, 6, 8, 13, 3, 3, 4, 4, 4,  12};
		print(a);
		secondlargest(a);
		print(a);
		secondsmallest(a);
		print(a);
	}

	public static void secondsmallest(int[] a)
	{
		if(a.length<2)
		{
			System.out.println("Invalid input");
			return;
		}
		Arrays.sort(a);
		
		
		for(int i=1; i<a.length-1; i++)
		{
			if(a[i]!=a[0])
			{
				System.out.println("Second smallest element: " +a[i]);
				return;
			}
		}
		System.out.println("no second smallest element in the array");
	}
	
	public static void secondlargest(int[] a)
	{
		if(a.length<2)
		{
			System.out.println("Invalid input");
			return;
		}
		Arrays.sort(a);
		//System.out.println(a[a.length-2]);
		
		for(int i=a.length-2; i>=0; i--)
		{
			if(a[i]!=a[a.length-1])
			{
				System.out.println("Second largest element: " +a[i]);
				return;
			}
		}
		System.out.println("no second largest element in the array");
	}
	
	static void print(int[] b)
	{
		for(int j=0; j<b.length; j++)
		System.out.print(b[j] + " ");
		System.out.println();
		System.out.println();
	}
}
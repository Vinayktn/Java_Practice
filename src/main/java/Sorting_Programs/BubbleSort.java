package Sorting_Programs;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] a = {12, 34, 8, 89, 93, 7, 6};
		System.out.println("This is before sorting:");
		print(a);
		System.out.println("\n");
		System.out.println("This is after sorting:");
		bubblesort(a);
		print(a);
	}

	static void bubblesort(int[] a)
	{
		if(a.length==0 || a.length==1)
		{
			System.out.println("Array is already sorted");
		}

		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
				}
			}
		}
	}

	static void print(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ "  ");
		}
	}
}
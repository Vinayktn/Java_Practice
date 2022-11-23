package Sorting_Programs;

public class SelectionSort
{
	public static void main(String[] args) 
	{
		int[] a = {38, 52, 9, 18, 6, 62, 13};
		int max=Integer.MIN_VALUE;
		System.out.println(max);

		System.out.println("This is before sorting:");
		print(a);
		System.out.println("\n");
		System.out.println("This is after sorting:");
		selectionsort(a);
		print(a);
	}

	static void selectionsort(int[] a)
	{
		int  min, temp=0;
		for(int i=0; i<a.length; i++)
		{
			min=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j] < a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
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

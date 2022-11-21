package Sorting_Programs;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] a = {64, 34, 8, 89, 93, 7, 6};
		System.out.println("This is before sorting:");
		print(a);
		System.out.println("\n");
		System.out.println("This is after sorting:");
		insertionsort(a);
		print(a);

	}

	static void insertionsort(int[] a)
	{
		int temp, j;
		for(int i=1; i<a.length; i++)
		{
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
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

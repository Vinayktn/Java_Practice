package Array_Programs;

public class insertionAtStart 
{
	public static void main(String[] args)
	{
		int [] a = new int[] {12, 4, 56, 32, 6};
		insertatstart(a, 32);
		print(a);
	}

	public static void insertatstart(int[] a, int val)
	{
		for(int i=a.length-1; i>0; i--)
		{
			a[i]=a[i-1];
		}
		a[0]=val;
	}


	static void print(int[] b)
	{
		for(int j=0; j<b.length; j++)
		System.out.print(b[j] + " ");
		System.out.println();
		System.out.println();
	}
}

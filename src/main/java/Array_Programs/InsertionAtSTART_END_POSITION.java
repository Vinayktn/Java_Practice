package Array_Programs;
public class InsertionAtSTART_END_POSITION 
{
	static int count=0;
	public static void main(String[] args)
	{
		int[] arr = new int[5];

		for(int i=0; i<arr.length; i++)
		{
			insert(arr, i+1);		
		}
		print(arr);
		
		insertatStart(arr, 34);
		
		print(arr);
		
		insertatPosition(arr, 2, 24);
		
		print(arr);
	}
	
	public static void insert(int[] a, int val) 
	{
		a[count++] = val;
	}

	public static void insertatStart(int[] n, int val) 
	{
		for(int i=n.length-1; i>0; i--)
		{
			n[i]=n[i-1];
		}
		n[0] = val;
	}

	public static void insertatPosition(int[] p, int position, int val)
	{
		for(int k=p.length-1; k>position; k--)
		{
			p[k]=p[k-1];
		}
		p[position] = val;
	}

	static void print(int[] b)
	{
		for(int j=0; j<b.length; j++)
		System.out.print(b[j] + " ");
		System.out.println();
		System.out.println();
	}
}
package Array_Programs;

public class DeleteElementsArray
{
	static int count=0;
	public static void main(String[] args)
	{
		int[] a = new int[5];

		for(int i=0; i<a.length; i++)
		{
			insert(a, i+1);
		}
		print(a);
		deleteatEND(a);
		print(a);
	}	

	public static void insert(int[] b, int val) 
	{
		b[count++] = val;
	}

	static void print(int[] d)
	{
		for(int i=0; i<count; i++)
		{
			System.out.print(d[i] + " \t");
		}
		System.out.println();
	}

	static void deleteatEND(int[] g)
	{
		if(g.length <= 0)
			return;
		count--;		
	}
}

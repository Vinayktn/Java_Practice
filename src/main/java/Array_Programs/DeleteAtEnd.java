package Array_Programs;

public class DeleteAtEnd
{
	static int count;
	public static void main(String[] args) 
	{
		int[] a = {12, 32, 43, 56, 78};
		count=a.length;
		print(a);
		deleteAtEnd(a);
		print(a);
	}

	static void print(int[] a)
	{
		for(int i=0; i<count; i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}

	static void deleteAtEnd(int[] a)
	{
		if(a.length<=0)
			return;
		count--;
	}
}

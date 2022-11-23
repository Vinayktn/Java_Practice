package Searching_Programs;

public class BinarySearcch 
{
	public static void main(String[] args)
	{
		int a[] = {12, 34, 56, 65, 78};
		BinarySearcch obj = new BinarySearcch();
		int i = obj.binarysearch(a, 78, 0, a.length-1);
		if(i==-1)
		{
			System.out.println("value doesnt exist");
		}
		else
		{
			System.out.println(i);
		}
	}

	public int binarysearch(int[] a, int val, int start, int end)
	{
		if(a.length==0 || start>end)
		{
			return -1;
		}

		int mid = (start+end)/2;

		if(val==a[mid])
		{
			return mid;
		}

		if(val<a[mid])
		{
			return binarysearch(a, val, start, mid-1);
		}
		else
		{
			return binarysearch(a, val, mid+1, end);
		}
	}
}
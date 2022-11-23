package Array_Programs;

public class KadensAlgo_MaxsumsubArray 
{
	public static void main(String[] args)
	{
		int[] a = {-5, 4, 6, -3, 4, -1};
		KadensAlgo_MaxsumsubArray obj = new KadensAlgo_MaxsumsubArray();
		int sum =	obj.maxsum(a);
		System.out.println("max sum of the sub-array is: " +sum);
	}

	public int maxsum(int[] a)
	{
		int cur_sum=0;
		int max_sum=0;

		for(int i=0; i<a.length; i++)
		{
			cur_sum=cur_sum+a[i];
			if(cur_sum>max_sum)
			{
				max_sum=cur_sum;
			}

			if(cur_sum<0)
			{
				cur_sum=0;
			}
		}
		return max_sum;
	}
}
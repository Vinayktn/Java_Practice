package Collections_Practice;

import java.util.PriorityQueue;

public class PQ_Kthsmallestelemets 
{
	static int k=3;
	public static void main(String[] args) 
	{
		int[] arr = {5, 3, 8, 1, 9};
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<arr.length; i++)
		{
 			pq.add(arr[i]);
		}

		for (int i = 0; i < k-1; i++) 
		{
			pq.poll();
		}

		int kthSmallest = pq.poll();
		System.out.println(kthSmallest);
	}
}
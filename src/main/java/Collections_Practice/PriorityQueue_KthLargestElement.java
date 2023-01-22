package Collections_Practice;

import java.util.PriorityQueue;

public class PriorityQueue_KthLargestElement 
{
	static int k=3;
	public static void main(String[] args)
	{
//		int[] a = {20, 10, 60, 30, 50, 40};
//		PriorityQueue_KthLargestElement d = new PriorityQueue_KthLargestElement();
//		int i = d.kthLargest(a, k);
//		System.out.println(i);
//	}
//
//	int kthLargest(int[] a, int k)
//	{
//		PriorityQueue< Integer> pq = new PriorityQueue<>();
//		for(int i=0; i<k; i++)
//		{
//			pq.add(a[i]);
//		}
// 		for(int i=k; i<a.length; i++)
//		{
//			if(pq.peek()<a[i])
//			{
//				pq.poll();
//				pq.add(a[i]);
//			}
//		}
//		return pq.peek();
		
		int[] arr = {5, 3, 8, 1, 9};
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<arr.length; i++)
		{
 			pq.add(arr[i]);
		}

		for (int i = 0; i < arr.length-k; i++) 
		{
			pq.poll();
		}

		int kthlargest = pq.poll();
		System.out.println(kthlargest);
		
	}
}
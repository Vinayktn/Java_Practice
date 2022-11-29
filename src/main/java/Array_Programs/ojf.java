package Array_Programs;

import java.util.Arrays;

public class ojf {
	static int sum=17;

	public static void main(String[] args)
	{
		int[] a = {1, 5, 12, 4, 6};
		//Arrays.sort(a);
		
		int low=0;
		int high=a.length-1;

		while(low<high)
		{
			if(a[low]+a[high]>sum)
			{
				high--;
			}
			
			else if(a[low]+a[high]<sum)
			{
				low++;
			}
			
			else if(a[low]+a[high]==sum)
			{
				System.out.println("Pair : (" +a[low]+ "," +a[high]+ ")");
				high--;
				low++;
			}
		}
	}

}

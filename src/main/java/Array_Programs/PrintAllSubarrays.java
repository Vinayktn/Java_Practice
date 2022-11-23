package Array_Programs;

public class PrintAllSubarrays 
{
	public static void main(String[] args) 
	{
		int[] a = {-5, 4, 6, -3, 4, -1};
		int sum=0;
		int[] b = new int[5];
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				int temp_sum=0;
				for(int k=i; k<=j; k++)
				{
					System.out.print(a[k]+ " ");
					temp_sum = temp_sum + a[k];
				}
				System.out.println();

				if (sum<temp_sum)
				{
					sum = temp_sum;
				}
 			}
		}
		System.out.println("Sum of max sub array is : " +(sum));
	}
}
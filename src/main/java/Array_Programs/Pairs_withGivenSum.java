package Array_Programs;

public class Pairs_withGivenSum 
{
	int sum=5;

	public static void main(String[] args) 
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		Pairs_withGivenSum obj = new Pairs_withGivenSum();
		obj.pairswithsum(a);
	}
	
	public void pairswithsum(int[] a)
	{
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

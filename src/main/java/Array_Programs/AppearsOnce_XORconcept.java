package Array_Programs;

public class AppearsOnce_XORconcept
{
	public static void main(String[] args) 
	{
		int[] a = {3, 4, 3, 4, 5, 6, 7, 6, 7};
		int res=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			res = res^a[i];
		}
		System.out.println(res);
	}
}

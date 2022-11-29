package Array_Programs;

public class Maxdiffbtw_twoelements {

	public static void main(String[] args) {
		int[] a = {11, 2, 6, 8, 7};
		print(a);
		int maximumdiff=maxdiff(a);
		System.out.println("maximem diff between two elements is: " +maximumdiff);
	}
	static void print(int[] b)
	{
		for(int j=0; j<b.length; j++)
		{
			System.out.print(b[j] + " ");
		}
		System.out.println();
	}
	
	static int maxdiff(int[] a)
	{
		int max=0;
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					max = Math.max(max, a[j]-a[i]);
				}
			}
		}
		return max;
	}
}

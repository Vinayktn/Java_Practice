package Array_Programs;

public class Seggregate0and1 {

	public static void main(String[] args) {
		int [] a = {4, 3, 0, 34, 0, 0, 33, 1, 68, 1, 79, 3, 90, 0};
		print(a);
		seggregate0and1(a);
		print(a);
	}

	static void print(int[] b)
	{
		for(int j=0; j<b.length; j++)
			System.out.print(b[j] + " ");
		System.out.println();
		System.out.println();
	}

	public static void seggregate0and1(int[] a)
	{
		int start=0;
		int end=a.length-1;

		while(start<end)
		{
			while(a[start]%2==0 && start<end)
			{
				start++;
			}

			while(a[end]%2==1 && start<end)
			{
				end--;
			}
			
			if(start<end)
			{
				int x=a[start];
				a[start]=a[end];
				a[end]=x;
				start++;
				end--;
			}
		}
	}
}
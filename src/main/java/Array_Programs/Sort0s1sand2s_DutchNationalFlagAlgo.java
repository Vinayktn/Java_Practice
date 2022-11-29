package Array_Programs;

public class Sort0s1sand2s_DutchNationalFlagAlgo {

	public static void main(String[] args) {

		int[] a = {0, 0, 1, 0, 2, 0, 2, 2, 1, 1, 1, 2, 1, 0, 0, 0};
		print(a);
		sort0and1and2(a);
		print(a);
	}

	static void print(int[] b)
	{
		for(int j=0; j<b.length; j++)
			System.out.print(b[j] + " ");
		System.out.println();
		System.out.println();
	}

	public static void sort0and1and2(int[] a) {
		int low = 0, mid=0;
		int high=a.length-1;
		while(mid<=high)
		{
			switch (a[mid]) 
			{
			case 0:
				if(a[mid]!=a[low])
				{
					int x = a[mid];
					a[mid] = a[low];
					a[low] = x;
				}
				low++;
				mid++;
				break;

			case 1:
				mid++;
				break;

			case 2:
				if(a[mid]!=a[high])
				{
					int y = a[mid];
					a[mid] = a[high];
					a[high] = y;
				}
				high--;
			}
		}
	}
}

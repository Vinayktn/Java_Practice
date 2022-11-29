package Array_Programs;

public class RotateanArray {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 70, 14, 2, 89, 32, 40};
		print(a);
		rotate(a, 2);
		print(a);
	}

	public static void rotate(int[] a , int k)
	{
		for(int i=0; i<k; i++)
		{
			leftrotate(a);
			rightrotate(a);
		}
	}

	public static void leftrotate(int[] a)
	{
		int temp=a[0];
		for(int i=0; i<a.length-1; i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
	}

	public static void rightrotate(int[] a)
	{
		int temp=a[a.length-1];
		for(int i=a.length-1; i>0; i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;	
	}

	static void print(int[] b)
	{
		for(int j=0; j<b.length; j++)
		{
			System.out.print(b[j] + " ");
		}
		System.out.println();
	}

}

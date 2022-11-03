package Array_Programs;

public class Array_CreationDiffways 
{
	public static void main(String[] args) 
	{
		int b[] = {10, 20, 30, 40, 50};
  		int[] a = new int[10];
 		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;

		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		System.out.println(a[3]);
		System.out.println(a[-2]);

	}

}

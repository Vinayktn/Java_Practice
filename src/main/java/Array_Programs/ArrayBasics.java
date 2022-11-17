package Array_Programs;

public class ArrayBasics {

	public static void main(String[] args) {
		int[] a = new int[3];

		for (int i=0; i<a.length; i++)
		{
			a[i]=i+5;
			System.out.println(a[i]);
		}

		for(int j=0; j<a.length; j++)
		{
			int sum = 2;
			sum = sum + a[j];
			System.out.println(sum);

		}
	}

}

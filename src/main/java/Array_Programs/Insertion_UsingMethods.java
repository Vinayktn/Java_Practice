package Array_Programs;

public class Insertion_UsingMethods {
	int count = 0;
	public static void main(String[] args) {

		int [] a = new int [5];
		Insertion_UsingMethods I = new Insertion_UsingMethods ();
		
		for (int j=0; j<a.length; j++)
		{
			I.insert(a, j+1);		
		}
		I.print(a);
	}

	public void print(int a[])
	{
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

	public void insert(int a[], int val)
	{
		a[count++] = val;
	}
}

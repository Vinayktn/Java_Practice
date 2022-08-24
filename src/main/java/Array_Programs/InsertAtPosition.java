package Array_Programs;

public class InsertAtPosition {

	public static void main(String[] args) {
		int [] a = new int[5];
		InsertAtPosition AP = new InsertAtPosition();
		for(int j=0; j<a.length; j++)
		{
			a[j]=j;
		}
		AP.InsertAtPosition(a, 2, 10);
		AP.print(a);
	}

	public void InsertAtPosition(int a[], int position, int val)
	{
		for (int i=a.length-1; i>position; i-- )
		{
			a[i]=a[i-1];
		}
		a[position]=val;
	}
	
	public void print(int a[])
	{
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}

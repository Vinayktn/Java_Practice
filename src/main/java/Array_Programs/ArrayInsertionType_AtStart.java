package Array_Programs;

public class ArrayInsertionType_AtStart {

	public static void main(String[] args) {
		int [] a = new int [5];
		ArrayInsertionType_AtStart AI = new ArrayInsertionType_AtStart();
		for (int j=0; j<a.length; j++)
		{
			a[j]=j;
		}
		AI.InsertatStart(a, 10);

		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

	public void InsertatStart(int a[], int val)
	{
		for (int i = a.length-1; i>0; i--)
		{
			a[i]=a[i-1];
		}
		a[0]=val;

	}

}
package Array_Programs;

public class DeleteAtPosition {
	static int DeleteElement = 30;
	public static void main(String[] args) {

		int [] a = {10,20,30,40,50};

		for (int i=0; i<a.length; i++)
		{
			if (a[i]==DeleteElement)
			{
				for(int j=i; j<a.length-1; j++)
				{
					a[j]=a[j+1];
				}
				break;
			}
		}

		for (int j=0; j<a.length-1; j++)
		{
			System.out.println(a[j]);
		}
	}
}




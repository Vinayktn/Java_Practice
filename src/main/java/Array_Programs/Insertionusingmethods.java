package Array_Programs;

public class Insertionusingmethods {
	int count = 0;
	public static void main(String[] args) 
	{
		System.out.println("Learning about array insertion");
		System.out.println(" ");

		Insertionusingmethods o = new Insertionusingmethods();
		int [] a = new int [5];

		for (int j=0; j<a.length; j++)
		{
			o.insert(a, j);
		}
		o.print(a);
		System.out.println(" ");

		o.insertatstart(a, 44);
		o.insertatstart(a, 29);
		o.print(a);
		System.out.println(" ");

		o.insertagiveindex(a, 2, 10);
		o.print(a);

	}

	public void insert(int a[], int val) 
	{
		a[count]=val;
		count++; 
	}


	public void insertatstart(int a[], int val) 
	{
		for (int i=a.length-1; i>0; i--)	
		{
			a[i]=a[i-1];
		}
		
		a[0]=val;
	}


	public void insertagiveindex(int a[], int position, int val) 
	{
		for (int i=a.length-1; i>0; i--)	
		{
			a[i]=a[i-1];
		}
		a[position]=val;
	}
	
	public void print(int a[]) 
	{
		for (int i =0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}

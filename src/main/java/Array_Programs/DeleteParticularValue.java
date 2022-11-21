package Array_Programs;

public class DeleteParticularValue {

	static int count=0;
	public static void main(String[] args)
	{
		int[] a = new int[5];

		for(int i=0; i<a.length; i++)
		{
			insert(a, i+1);
		}
		print(a);
		deleteParticularvalue(a, 21);
		print(a);
	}	

	public static void insert(int[] b, int val) 
	{
		b[count++] = val;
	}

	public static void deleteParticularvalue(int[] g, int val)
	{
		int i;
		for( i=0; i<count; i++)
		{
			if(g[i] == val)
			{
				break;
			}
		}

		if(i == count) 
		{
			System.out.println("The value doesnt exists in this array ");
			return;
		}

		for(int j=i; j<count-1; j++)
		{
			g[j] = g[j+1];
		}

		count--;
	}

	static void print(int[] d)
	{
		for(int i=0; i<count; i++)
		{
			System.out.print(d[i] + " \t");
		}
		System.out.println();

	}
}

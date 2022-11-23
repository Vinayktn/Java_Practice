package Array_Programs;

public class LeadersinArray
{
	public static void main(String[] args)
	{
		int[] a = {1, 23, 43, 78, 21, 95, 4, 2};

		for(int i=0; i<a.length; i++)
		{
			boolean flag=false;

			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(a[i]+ " - Leader");
			}
		}
	}
}

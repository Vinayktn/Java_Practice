package BasicJavaPrograms;

public class first100FIBO 
{
	public static void main(String[] args) 
	{
		int no1=0, no2=1;
		int sum=0;
		for(int i=1; i<=100; i++)		
		{
			sum=no1+no2;
			no1=no2;
			no2=sum;
			System.out.println(sum);
		}
	}
}

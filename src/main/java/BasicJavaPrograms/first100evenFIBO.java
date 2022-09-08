package BasicJavaPrograms;

public class first100evenFIBO 
{
	public static void main(String[] args) 
	{
		int no1=0, no2=1;
		int sum = 0;
		while(sum<=100)
		{
			sum=no1+no2;
			no1=no2;
			no2=sum;
			if(sum%2==0 && sum<=100)
			{
				System.out.println(sum);
			}
		}

 	}
}

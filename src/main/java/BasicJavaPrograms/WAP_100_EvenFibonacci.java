package BasicJavaPrograms;

public class WAP_100_EvenFibonacci {

	public static void main(String[] args)	
	{
		int no1=0, no2=1;


		int sum = 0,res = 0;
		while(sum<=200)
		{
			sum=no1+no2;
			no1=no2;
			no2=sum;
			if (sum%2==0 && sum <=200)
			{
				System.out.println(" "+sum);
			}
		}
		res = res+sum;

		System.out.println(res);

	}

}

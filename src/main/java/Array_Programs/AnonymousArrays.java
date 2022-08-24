package Array_Programs;

public class AnonymousArrays {
	static int r,k,n,c;
	public static void main(String[] args) 
	{

		
		k=3;
		n=14;
		r=k;
		
		
		while(r>=k)
		{
			r=n%k;
			c=n/k;
		}
		
		System.out.println(c);
	}}

package Array_Programs;

public class Lengthofmaxincreasingsubarray {

	public static void main(String[] args) {
		int[] a = {1, 2, 6, 0, 7};
		print(a);
		int maximeumlenght=maxlenofsubarray(a);
		System.out.println(maximeumlenght);
		int minimumlength=minlenofsubarray(a);
		System.out.println(minimumlength);
	}

	static int maxlenofsubarray(int[] a)
	{
		int len=1;
		int maxlen=1;

		for(int i=1; i<a.length; i++)
		{
			if(a[i-1] < a[i])
			{
				len++;
			}
			else
				len=1;
			maxlen = Math.max(maxlen, len);
		}
		return maxlen;		
	}
	
	static int minlenofsubarray(int[] a)
	{
		int len=1;
		int maxlen=1;

		for(int i=1; i<a.length; i++)
		{
			if(a[i-1] < a[i])
			{
				len++;
			}
			else
				len=1;
			maxlen = Math.min(maxlen, len);
		}
		return maxlen;		
	}

	static void print(int[] b)
	{
		for(int j=0; j<b.length; j++)
		{
			System.out.print(b[j] + " ");
		}
		System.out.println();
	}
}

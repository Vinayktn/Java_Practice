package Array_Programs;

import java.util.Scanner;

 
class SumofElements_UIArray {
   static Scanner sc = new Scanner(System.in);

    public static void main (String[] args)
    {
        System.out.println("Enter the length of the array");
        long length = sc.nextLong();
        long[] a = new long[(int) length];
        insert(a);
        print(a);
        long sum1=getSum(a);
        System.out.println("Sum is:" +sum1);
    }
    public static void insert(long[] a)
    {
      	for(int i=0; i<a.length; i++)
    		{
    			a[i]=sc.nextLong();
    		}
    }
    
    public static void print(long[] a)
    {
       	for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
    }
    
    public static long getSum(long a[])
    {
        long sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum = sum+a[i];
        }
        return sum;
    }
}
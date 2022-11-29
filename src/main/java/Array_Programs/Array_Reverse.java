
package Array_Programs;

import java.util.Scanner;

public class Array_Reverse {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of elements you want to  insert: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter "+n+" elements into the array:");
		insert(a);
		print(a);
		reverse(a);
		print(a);
	}

	static void insert(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
	}

	static void reverse(int[] a)
	{
		int start = 0;
		int end = a.length-1;
		int temp = 0;
		while(start<end)
		{
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
	}
	static void print(int[] d)
	{
		for(int i=0; i<d.length; i++)
		{
			System.out.print(d[i] + " \t");
		}
		System.out.println();
	}

}
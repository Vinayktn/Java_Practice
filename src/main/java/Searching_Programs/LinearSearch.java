package Searching_Programs;
import java.util.Scanner;

public class LinearSearch
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("How many values do you want to insert?? ");
		int lenght = sc.nextInt();
		int[] a = new int[lenght];
		System.out.println("Enter the values you want to insert ");
		insert(a);
		print(a);
		search(a, 32);
	}

	static void insert(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
	}

	static void print(int[] b)
	{
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}

	static void search(int[] a, int val)
	{
		int flag=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == val)
			{
				flag=1;
				System.out.println("Your val is present at index number " +i);
				break;
			}
		}
		if(flag==0)
			System.out.println("value not found");
	}
}
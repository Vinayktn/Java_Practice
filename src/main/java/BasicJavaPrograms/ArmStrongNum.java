package BasicJavaPrograms;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nnumber ");
		int num = sc.nextInt();
		int temp1=num;
		int len = 0;
		while(temp1!=0)
		{
			temp1=temp1/10;
			len=len+1;
		}
		System.out.println("length of the number is "+len);
		int temp2=num;
		int rem=0;
		int arm = 0;
		while(temp2!=0)
		{
			rem=temp2%10;
			int mul=1;
			for(int i=1; i<=len; i++)
			{
				mul=mul*rem;
			}
			arm = arm+mul;
			temp2=temp2/10;
		}
		System.out.println("number is "+arm);
		if (arm==num)
			System.out.println(num+ " is armstrong");
		else
			System.out.println(num+ " is not armstrong");
	sc.close();
	}
}

package BasicJavaPrograms;

import java.util.Scanner;

public class areaofrec {

	void area(int x, int y)
	{
		int area = x * y;
		System.out.println(area);
	}

	public static void main(String[] args) 
	{
		areaofrec a = new areaofrec();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lenght");
		int len = s.nextInt();
		System.out.println("Enter the breadth");
		int brd = s.nextInt();
		a.area(len, brd);
		s.close();
	}

}

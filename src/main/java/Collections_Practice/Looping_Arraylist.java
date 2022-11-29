package Collections_Practice;

import java.util.ArrayList;

public class Looping_Arraylist {

	public static void main(String[] args)
	{
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
//		for(int i: a)
//		{
//			System.out.println(i);
//		}
		
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
//		for(Object obj: al)
//		{
//			System.out.println(obj);
//		}
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
	}

}

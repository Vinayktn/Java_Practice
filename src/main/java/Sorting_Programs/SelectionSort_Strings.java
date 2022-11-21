package Sorting_Programs;

public class SelectionSort_Strings {
	static String temp="";
	 static int min;
	public static void main(String[] args) {
 //int[] a= {38,52,8, 6, 78, 89};
		 String[] a= {"vinay","harsha","praveen","sunil"};

		for(int i=0; i<a.length; i++)
		{
			min=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j].compareTo(a[min])<0)
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length; i++)
		{
		System.out.print(a[i]+   "  ");

	}
}
}

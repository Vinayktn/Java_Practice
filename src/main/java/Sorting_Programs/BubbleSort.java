package Sorting_Programs;

public class BubbleSort {
	 static int temp;
	public static void main(String[] args) {

 int [] a = {20,40,10,5,3};
 for(int i=0; i<a.length; i++) //this loop is for no of rounds
 {
	 for(int j=0; j<a.length-1-i; j++)
	 {
		 if(a[j]>a[j+1])
		 {
			 temp=a[j];
			 a[j]=a[j+1];
			 a[j+1]=temp;
		 }
	 }
 }
 for(int i=0; i<a.length; i++) //this loop is for no of rounds
 {
	 System.out.println(a[i]);
 }
 
	}

}

package Array_Programs;

import java.util.Scanner;

 
public class NthFiboPosition_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position: ");
		int position = sc.nextInt();
		NthFiboPosition_Array sfb = new NthFiboPosition_Array();
		System.out.println(sfb.getnthfib(position));
	}

	int getnthfib(int pos) 
	{
		int[] arr = new int[pos];
		int n1 = 0;
		int n2 = 1;
		arr[0] = 0;
		arr[1] = 1;
		int n3;
		for (int i = 2; i < pos; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			arr[i] = n3;
		}
		return arr[pos - 1];
	}
}

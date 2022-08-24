package Array_Programs;

public class Arrays {
	int a=10;
	int b=20; 
	int c=30;

	public static void main (String [] args) {
		System.out.println("Entering to the world of collections");

		int[][][] y = new int[3][][];

		y[0] = new int [3][];

		y[0][0]=new int [2];

		y[0][0][0]=6;

		int[] [] z = {{1,2,3},{4,5,6}};
		for (int[] array: z) {
			for(int ele: array) {
				System.out.println(ele);

			}
		}

	}

}

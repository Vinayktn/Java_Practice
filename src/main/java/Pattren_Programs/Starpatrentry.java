package Pattren_Programs;
//left floyeds triangle
public class Starpatrentry {

	public static void main(String[] args) {



		int w;
		int n=5;
		for (int row=0; row < n; row++)
		{

			int totalnospaces = row < n ? n-1-row: row;
			
			if (totalnospaces == n-1-row)

			{
				w = 0;
			}
			else
			{
				w=1;
			}
			
			for (int s = w; s <= totalnospaces - 1 ; s++)
			{
				System.out.print(" ");
			}

 			for (int col = 0; col <= row ; col++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}


		for (int row=2; row <= n; row++)
		{

			for (int s = 1; s <= row - 1 ; s++)
			{
				System.out.print(" ");
			}

			for (int col = n; col >= row   ; col--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}

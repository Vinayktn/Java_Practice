package Practice_Loops;

public class ForDemo13 {

	public static void main(String[] args) 
	{
		int n=5;
		for (int row=0; row < n; row++)
		{
			int noofspaces = n - 1 - row;
			for (int s = 0; s <= noofspaces - 1 ; s++)
			{
				System.out.print(" ");
			}
			
			int totalcolumnsinrow = row;
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
/*   



        *
      * *
    * * *
  * * * *
* * * * * n
  * * * * n - 1
    * * * n - 2
      * * n - 3
        * n - 4
*/
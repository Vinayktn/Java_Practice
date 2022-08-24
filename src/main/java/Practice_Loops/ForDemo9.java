package Practice_Loops;

public class ForDemo9 {

	public static void main(String[] args) 
	{
		int n=5;
		for (int row=0; row <  n + 1 ; row++)
		{
	int noofspaces = n - row;
	for (int s = 0; s < noofspaces ; s++)
	{
		System.out.print(" ");
	}
	int noofcols = row > n ? 2 * n - row:row;
	for (int col = 0; col < noofcols ; col++)
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
* * * * *
  * * * *
    * * *
      * *
        *


*/
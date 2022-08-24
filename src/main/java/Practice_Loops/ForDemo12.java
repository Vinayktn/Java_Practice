package Practice_Loops;

public class ForDemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int row=0; row< 2 * n; row++)
		{
			int totalcolumnsinrow = row > n ? 2 * n - row: row;
			for(int col=0; col < totalcolumnsinrow; col++)
			{
				System.out.print("*");
			}
			System.out.println("");

		}
	}
}


package Practice_Loops;

public class BreakandContinue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
			
				System.out.println(i+ " : " +j);
				if (i == 3) {
					continue;
				}
			}

		}
	}

}

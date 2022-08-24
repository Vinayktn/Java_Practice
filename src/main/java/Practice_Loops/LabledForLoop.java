package Practice_Loops;

public class LabledForLoop {

	public static void main(String[] args) {
		L1:for (int i = 1; i <= 5; i++)
		{
			L2:for (int j = 1; j <= 5; j++)
			{
			
				System.out.println(i+ " : " +j);
				if (i == 3) {
					break L1;
				}
			}

	}
	}
}

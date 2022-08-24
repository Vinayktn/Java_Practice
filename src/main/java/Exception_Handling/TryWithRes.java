package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithRes {

	public static void main(String[] args) {
		FileInputStream	fis = null;
		try
		{
			new FileInputStream("");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

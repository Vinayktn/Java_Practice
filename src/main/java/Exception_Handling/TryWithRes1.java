package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithRes1 {

	public static void main(String[] args) throws IOException 
	{
		try(FileInputStream	fis = new FileInputStream(" "))
		{

		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}

}

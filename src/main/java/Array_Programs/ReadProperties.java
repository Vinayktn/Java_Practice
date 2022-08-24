package Array_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
 
		FileInputStream fis = new FileInputStream("src\\com\\june_06\\Emp.properties");
		Properties p = new Properties();
		p.load(fis);
		String id = p.getProperty("Eid");
		String Enm = p.getProperty("EName");
		String Ephno = p.getProperty("EPhoneNumber");

		System.out.println(id);
		System.out.println(Enm);
		System.out.println(Ephno);

	}

}
 
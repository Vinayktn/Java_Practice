package BasicJavaPrograms;
import java.util.Scanner;

class ObjectLimitExceededException extends Exception
{

}
public class objectrestrict 
{
	private static int count = 0;
	private objectrestrict()
	{
		count++;
	}

	public static objectrestrict getInstance(int num) throws ObjectLimitExceededException  
	{
		if(count < num){
			//objectrestrict instance = new objectrestrict();
			return new objectrestrict();
		}
		else
		{
			throw new ObjectLimitExceededException();
		}
	} 

	public static void main(String[] args) throws ObjectLimitExceededException 
	{
		objectrestrict obj = new objectrestrict();
		System.out.println(obj.hashCode());
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<num; i++)
		{
			objectrestrict instance = getInstance(num);
			System.out.println(instance.hashCode());
		}
		sc.close();
	
	}
}
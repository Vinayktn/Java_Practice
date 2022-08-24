package Exception_Handling;
import java.util.Scanner;

class Youngerageexception extends RuntimeException 
{
	public Youngerageexception() 
	{
		super();
	}

	public Youngerageexception(String msg)
	{
		super(msg);
	}
}

public class Voting
{
	void doVote()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = s.nextInt();

		if (age<18)
		{
			throw new Youngerageexception("Your age is small");
		}
		else 
		{
			System.out.println("You can vote");
		}
	}

	public static void main(String[] args)
	{
		Voting v = new Voting();
		try {
			v.doVote();

		}
		catch(Youngerageexception e){
			System.out.println(e);
		}
		System.out.println("good program");
	}
}

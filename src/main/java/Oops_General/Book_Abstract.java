package Oops_General;
import java.util.*;

//public class Book_Abstract {

//}

abstract class Book
{
	String title="oojrf";
	abstract void setTitle(String s);

	String getTitle()
	{
		return title;
	}
}

class Mybook extends Book
{
	@Override
	void setTitle(String title) 
	{
		title=this.title;

//		System.out.println(s);
//		System.out.println(title);
//		title =s;
		System.out.println(title);
	}
}


//Write MyBook class here

public class Book_Abstract{

	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();

		//Book obj = new Book();//cannot create the object of an abstract class
		Mybook obj = new Mybook();
		obj.setTitle(title);
		System.out.println("The title is: " +obj.getTitle());
	}
}
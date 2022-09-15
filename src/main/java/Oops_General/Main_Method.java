package Oops_General;

//We can overload a main method but we cannot override the main method
public class Main_Method 
{
 	 public static void main(int a)
	 { 
	   System.out.println("Second main() method"); 
	    main(); 
	 } 
 	 
	public static void main()
	{ 
	   System.out.println("Third main method"); 
	 } 
	
	public static void main(String[] args) 
	{ 
	   System.out.println("main(String[] args)"); 
	     main(20); 
	 } 
}

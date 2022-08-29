package Oops_General;

public class NoofObjects {
	static int count = 0;
	NoofObjects()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		NoofObjects n1 = new NoofObjects();
		NoofObjects n2 = new NoofObjects();
		NoofObjects n3 = new NoofObjects();
		NoofObjects n4 = new NoofObjects();
		NoofObjects n5 = new NoofObjects();
		NoofObjects n6 = new NoofObjects();
		System.out.println(count);
	}

}

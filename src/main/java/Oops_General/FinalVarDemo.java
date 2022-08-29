package Oops_General;

public class FinalVarDemo {
	final String PANCARD;
	final int marks=90;
	FinalVarDemo(String PAN)
	{
		PANCARD = PAN;
	}
	
	void marks()
	{
		final int marks = 90;
	//	marks = 98;
	}
	
	void show()
	{
		System.out.println(PANCARD);
	}
	
	public static void main(String[] args) {
		FinalVarDemo obj = new FinalVarDemo("AVWPV5620Q");
		System.out.println(obj.PANCARD);
		obj.show();
	}

}

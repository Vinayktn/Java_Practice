package Constructors;

public class CopyConstructor {
	int i;
	int j;
	CopyConstructor(int i, int j)
	{
		this.i=i;
		this.j=j;
	}

	CopyConstructor(CopyConstructor cc)
	{
		this.i=cc.i;
		this.j=cc.j;
	}
	public static void main(String[] args) {
		CopyConstructor obj = new CopyConstructor(3, 4);
		System.out.println("i=" + obj.i+ " and " + "j=" + obj.j);

		CopyConstructor obj1 = new CopyConstructor(obj);
		obj1.i=67;
		obj1.j=87;
		System.out.println("i=" + obj.i+ " and " + "j=" + obj.j);
		System.out.println("i=" + obj1.i+ " and " + "j=" + obj1.j);
	}
}

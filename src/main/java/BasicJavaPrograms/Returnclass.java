package BasicJavaPrograms;

public class Returnclass {

	public void add(int a, int b)
	{
		int c = a + b;
		System.out.println(c);
	}

	public float sub(float x, float y)
	{
		float z = x + y;
		return z;
	}

	public static void main(String[] args) {

		Returnclass obj = new Returnclass();
		obj.add(3, 3);
		float z =	obj.sub(5.234f, 2.43f);
		System.out.println(z);

	}

}

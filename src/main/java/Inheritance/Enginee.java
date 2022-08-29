package Inheritance;

 class Enginee
{
	void start()
	{
		System.out.println("enginee starts ");
	}
}

class Musicplayer extends Enginee
{
	void play()
	{
		System.out.println("Music is playing ");
	}
}

class motor extends Musicplayer
{
	void move()
	{
		System.out.println("Car is moving ");
	}
	public static void main(String[] args) 
	{

		Enginee obj = new Enginee();
		obj.start();

		Musicplayer m = new Musicplayer();
		m.play();
	}
}

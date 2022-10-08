//Single inheritance with methods
class Vehicle
{
 void run()
{
   System.out.println("vehicle is running");
}
}
class Bike extends Vehicle
{
	void speed()
	{
		System.out.println("bike is in high speed");
	}
}
public class SingleInh2
{
	public static void main(String[] args)
	{
		Bike b=new Bike();
		b.speed();
		b.run();
	}
}


//Single inheritance with constructors
class Vehicle
{
	Vehicle()
	{
		System.out.println("base ctr");
	}
}
class Bike extends Vehicle
{
	Bike()
	{
		System.out.println("child ctr");
	}
}
public class SingleInh3
{
	public static void main(String[] args)
	{
		Bike b=new Bike();
	}
}

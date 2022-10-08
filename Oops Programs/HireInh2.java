//Hirerhical inheritance with constructor
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
		System.out.println("child ctr1");
	}
}
class Car extends Vehicle
{
	Car()
	{
		System.out.println("child ctr2");
	}
}
public class HireInh2
{
	public static void main(String[] args)
	{
		Bike b=new Bike();
		Car c=new Car ();
	}
}


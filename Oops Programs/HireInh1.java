//Hirerchical inheritance with methods
class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle
{
	void speed()
	{
		System.out.println("bike is running");
	}
}
class Car extends Vehicle
{
	void milage()
	{
		System.out.println("car milage");
	}
}
public class HireInh1
{
	public static void main(String[] args)
	{
		Bike b=new Bike();
		Car c=new Car();
		b.run();
		b.speed();
		c.run();
		c.milage();
	}
}

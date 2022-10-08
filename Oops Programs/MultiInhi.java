class Animal
{
	Animal()
	{
		System.out.println("animal is walking");
	}
}
class Dog extends Animal
{
	Dog()
	{
		System.out.println("dog is eating");
	}
}
class Babydog extends Dog
{
	Babydog()
	{
		System.out.println("babydog is drinking");
	}
}
public class MultiInhi
{
	public static void main(String[] args)
	{
		Babydog s=new Babydog();
	}
}
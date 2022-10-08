//instance of operator
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
public class Instanceoperator
{
	public static void main(String[] args)
	{
		Animal a=new Animal();
		System.out.println(a instanceof Animal);
	}
}
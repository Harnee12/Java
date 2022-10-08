//Method overriding with hirerchical inheritance
class Bank
{
	int intr()
	{
		return 0;
	}
}
class Hdfc extends Bank
{
	int intr()
	{
		return 7;
	}
}
class Axis extends Bank
{
	int intr()
	{
		return 8;
	}
}
public class MethodOverride2
{
	public static void main(String[] args)
	{
		Hdfc h=new Hdfc();
		System.out.println(h.intr());
		Axis a=new Axis();
		System.out.println(a.intr());
		Bank b=new Bank();
		System.out.println(b.intr());
	}
}
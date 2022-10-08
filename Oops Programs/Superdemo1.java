//Super variable
class A
{
	int x=10;
}
class B extends A
{
	int x=20;
	void show()
	{
		System.out.println(super.x);
		System.out.println(x);
	}
}
public class Superdemo1
{
	public static void main(String[] args)
	{
		B b=new B();
		b.show();
	}
}
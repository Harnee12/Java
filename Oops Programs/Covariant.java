//Co variant type
class A
{
	A get()
	{
		return this;
	}
	void msg1()
	{
		System.out.println("covariant type1");
	}
}
class B extends A
{
	B get()
	{
		return this;
	}
	void msg2()
	{
		System.out.println("covariant type2");
	}
}
public class Covariant
{
	public static void main(String[] args)
	{
		new B().get().msg2();
		new A().get().msg1();
	}
}
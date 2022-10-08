//final variable[This program will get error becoz final variable can't change the value]
class Simple
{
	 final int x=10;
	void show(int a)
	{
		x=a;
		System.out.println(x);
	}
}
public class Finaldemo1
{
public static void main(String[] args)
{
	Simple s=new Simple();
	s.show(20);
}
}
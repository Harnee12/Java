//HARNEE A
//CG2576
//Program for multiple inherritance[2 parent,1 child]
interface Red//interface1
{
	void f1();//abstract method1
	
}
interface Green//interface2
{
	void f2();//abstract method2
	
}
class Yellow implements Red,Green
{
	public void f1()
	{
		System.out.println("Red color");
	}
	public void f2()
	{
		System.out.println("Green color");
	}
	
}
public class Multiple
{
	public static void main(String[] args)
	{
		Yellow m=new Yellow();//object creation
		m.f1();
		m.f2();
	}
}

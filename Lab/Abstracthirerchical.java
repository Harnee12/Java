//HARNEE A
//CG2576
//Abstract class using hirerchical inheritnce
abstract class Shape//abstract class[parent class]
{
	void draw()//instnce method
	{
		System.out.println("Draw the shape");
	}
}
class Circle extends Shape//child class 1
{
	void draw1() //child method1
	{
		System.out.println("circle");
	}
}
class Rectangular extends Shape//child class 2
{
	void draw2()//child method2
	{
		System.out.println("rectangular");
	}
}
public class Abstracthirerchical
{
	public static void main(String[] args)
	{
		Circle c=new Circle();//child1 object creation
		Rectangular r=new Rectangular();//child2 object creation
		c.draw();
		c.draw1();
		r.draw();
		r.draw2();
	}
}

		
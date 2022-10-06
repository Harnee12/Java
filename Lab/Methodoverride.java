//HARNEE A
//CG2576
//Method overriding
class Bank//parent class
{
	int interest()//return method
	{
		return 0;
	}
}
class Sbi extends Bank//child class1
	{
		int interest()//return method
		{
			return 7;
		}
	}
class Axis extends Bank//child class2
{
	int interest()//return method
	{
		return 8;
	}
}
class Icici extends Bank//child class3
{
	int interest()//return method
	{
		return 9;
	}
}
public class Methodoverride
{
	public static void main(String[] args)
	{
		Sbi s=new Sbi();//object creation for child class1
		Axis a=new Axis();//object creation for child class2
		Icici i=new Icici();//object creation for child class3
		System.out.println(s.interest());
		System.out.println(a.interest());
	    System.out.println(i.interest());
	}
}

	
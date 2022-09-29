//HARNEE A
//CG2576
// 'this' keyword constructor chaining 
class Student//Declare the class
{
	int sid;//data members
	String sname;
	double fees;
	Student()//no param constructor
	{
		this(10,"vijay");//calling the 2 param constructor using 'this' keyword
		System.out.println("Students Details");
	}
	Student(int x)//1 param constructor
	{
		this(3,"sasi",300);//calling the 3 param constructor using 'this' keyword
		sid=x;
		System.out.println(sid+" ");
	}
	Student(int x,String y)//2 param constructor
	{
		this(5);//calling the 1 param constructor using 'this' keyword
		sid=x;
		sname=y;
		System.out.println(sid+" "+sname);
	}
	Student(int x,String y,double z)//3 param constructor
	{
		sid=x;
		sname=y;
		fees=z;
		System.out.println(sid+" "+sname+" "+fees);
	}

}

public class Ctrchain {

	public static void main(String[] args) 
	{
        Student m1=new Student();//object creation

	}

}

//HARNEE A
//CG2576
//Hirerchicl inheritance
class Person//parent class creation
{
	int pid;//data members
	String pname;
	Person()//parent constructor
	{
		pid=10;
		pname="harnee";
		System.out.println(pid+" "+pname);
	}
	
}
class Student extends Person//child class1
{
	float marks;//data member
	Student(float z)//child constructor
	{
		marks=z;
	}
	void show1()//show method
	{
		System.out.println(marks);//print the marks
	}
}
class Employee extends Person//child class2
{
	double salary;
	Employee(double m)//child constructor
	{
		salary=m;
	}
	void show2()//show method
	{
		System.out.println(salary);
	}
}
public class Hirerchical
{
	public static void main(String[] args)
	{
		Student s=new Student(99.7f);//calling constructor with float value
		s.show1();//print the marks
		Employee e=new Employee(20000);//calling constructor with double value
		e.show2();//print the salary
	}
}
	
	
//HARNEE A 
//CG2576
//Program to get the student details using class and objects
class Students//declare the class
{
	int sid;//data members
	String sname;
	double marks;
	void input(int x,String y,double z)//input method to get the data 
	{
		sid=x;
		sname=y;
		marks=z;
	}
	void output()//output method to print the data
	{
		System.out.println(sid+" "+sname+" "+marks);
	}
}
public class StudentsDetails
{
	public static void main(String[] args)
	{
		Students s1=new Students();//object creation for student1
		s1.input(10,"mahi",76.8);//give the inputs using object
		s1.output();//print the output using same object
		Students s2=new Students();//object creation for student2
		s2.input(11,"ravi",98.7);//give the inputs using object
		s2.output();//print the output using same object
	}
}
		
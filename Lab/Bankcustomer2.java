//HARNEE A
//CG2576
//Package calling from another package
package anudip2;//package creation "anudip2"
import anudip.Bankcustomer1;//import the details from anudip package
public class Bankcustomer2//class creation
{
	public static void main(String[] args)//main method
	{
		Bankcustomer1 s1=new Bankcustomer1();//object creation
		s1.input(12,"hari",20000);//to give the input using object
		s1.show();//to print the details using object
	}
}
//HARNEE A
//CG2576
//Program to print bankcustomer details using package
package anudip;//package creation
public class Bankcustomer1//declare class 
{
	int acno;//data members
	String cname;
	double amt;
	public void input(int x,String y,double z)//input method to get the data
	{
		acno=x;
		cname=y;
		amt=z;
	}
	public void show()//output method to print the data
	{
		System.out.println(acno+" "+cname+" "+amt);
	}
}
//HARNEE A
//CG2576
//Program to get bankcustomer details using constructor overloading
class Bankcustomer//declare class
{
	int acno;//data members
	String atype;
	double amt;
	Bankcustomer()//no param constructor
	{
		acno=10;
		atype="xyz";
		amt=10000;
	}
	Bankcustomer(int x)//1 param constructor
	{
		acno=x;
	}
	Bankcustomer(int x,String y)//2 param constructor
	{
		acno=x;
		atype=y;
	}
	Bankcustomer(int x,String y,double z)//3 param constructor
	{
		acno=x;
		atype=y;
		amt=z;
	}
	void show()//method for print the data
	{
		System.out.println(acno+" "+atype+" "+amt);
	}

}

public class CustomerDetails {

	public static void main(String[] args) {
Bankcustomer m1=new Bankcustomer();
m1.show();
Bankcustomer m2=new Bankcustomer(11);
m2.show();
Bankcustomer m3=new Bankcustomer(12,"sai");
m3.show();
Bankcustomer m4=new Bankcustomer(13,"sasi",2000);
m4.show();

	}

}

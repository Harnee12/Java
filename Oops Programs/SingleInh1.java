//Single inheritance
class Emp
{
	double sal=12000;//parent class variable
}
class Netpay extends Emp
{
	double bonus=5000;//child class variable
}
public class SingleInh1
{
	public static void main(String[] args)
	{
		Netpay n=new Netpay();//n is object of child class
	    System.out.println(n.sal);//base member
		System.out.println(n.bonus);//derived member
	}
}

		

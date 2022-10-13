//HARNEE A
//CG2576
//Wrp to prepare Exception using 'throw' and 'throws' keywords?
import java.io.IOException;
class TestThrows
{
	void m()throws IOException
	{
		throw new IOException("device error");//checked exception
	}
	void n()throws IOException
	{
		m();
	}
	void p()
	{
		try//try-catch block
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");//print the exception method
			System.out.println(e.getMessage());//get the message
		}
	}
	public static void main(String[] args)
	{
		TestThrows obj=new TestThrows();//object creation
		obj.p();//calling method p() using object
	}
}
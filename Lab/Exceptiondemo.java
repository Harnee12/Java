//HARNEE A
//CG2576
//wrp to demo 'NullPointerException' and 'ArrayIndexoutOfBoundException'  with nested ...try blocks
public class Exceptiondemo
{
	public static void main(String[] args)
	{
		try//outer try
		{
			try //first inner try
			{
				String s1=null;//declare the String as null
				System.out.println(s1.length());//find the length
			}
			catch(NullPointerException e)//first inner catch
			{
				System.out.println("NullPointerException Occured");
			}
			try//second inner try
			{
				int a[]={1,2,3,4};//declare the array
				System.out.println(a[5]);
			}
			catch(ArrayIndexOutOfBoundsException e)//second inner catch
			{
				System.out.println("ArrayIndexOutOfBoundsException occured");
			}
		}
		catch(Exception e)//outer catch
		{
			System.out.println("Exception Occured");
		}
		System.out.println("rest of the code...");
	}
}

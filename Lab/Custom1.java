//HARNEE A
//CG2576
//Wrp to user-deined exception[custom exception]
class InvalidLoginException extends Exception //define the class with exception
{
    public InvalidLoginException(String s)//param constructor
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class Custom1
{
   void LoginCheck(int pwd) throws InvalidLoginException{
	if(pwd!=2576)//checking condition
	{
		throw new InvalidLoginException("Login Invalid");//Throw the exception using throw keyword
	}
   }
   
    public static void main(String args[])
    {
    	Custom1 obj = new Custom1();//object creation
        try//try-catch block
        {
            obj.LoginCheck(2578);//calling method using object
        }
        catch (InvalidLoginException e)
        {
            System.out.println("Caught the exception");//print the exception 
            System.out.println(e.getMessage());//get the message
        }
    }
}

	




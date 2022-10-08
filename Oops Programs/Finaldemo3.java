//final class [This program will get error becoz final method cannot override]
 class Teacher
{
	void activity()
	{
		System.out.println("Teacher is teaching");
	}
}
 class Students extends Teacher
{
	final void activity()
	{
		System.out.println("Students are listening");
	}
}
public class Finaldemo3
{
	public static void main(String[] args)
	{
		Students s=new Students ();
		s.activity();
	}
}

//Super Method
class Teacher
{
	void activity()
	{
		System.out.println("Teacher is teaching");
	}
}
class Students extends Teacher
{
	void activity()
	{
		System.out.println("Students are listening");
	}
	void show()
	{
		super.activity();
		activity();
	}
}
public class Superdemo2
{
	public static void main(String[] args)
	{
		Students s=new Students();
		s.show();
	}
}
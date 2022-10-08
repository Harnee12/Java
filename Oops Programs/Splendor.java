//upcasting
class Bike
{
	void show()
	{
		System.out.println("bike is running");
	}
}
class Splendor extends Bike
{
	void show()
	{
		System.out.println("splendor is running");
	}
	public static void main(String[] args)
	{
		Bike b=new Splendor();
		b.show();
	}
}
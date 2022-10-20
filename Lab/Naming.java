//HARNEE A
//CG2576
//Program to create threading with getName,setName() methods
class Naming extends Thread//naming class extends from Thread class
{
	public void run()//run method
	{
		System.out.println("program is running");
	}
	public static void main(String[] args)
	{
		Naming t1=new Naming();//thread calling with object
		Naming t2=new Naming();//same thread calling with another object
		System.out.println("Name of t1:"+t1.getName());//getting thread name[it gives default thread name]
		System.out.println("Name of t2:"+t2.getName());
		t1.start();//start the thread
		t2.start();
		t1.setName("Harnee");//setting the thread name
		t2.setName("Krithika");
		System.out.println("Name of t1 after changes:"+t1.getName());//get the thread name after change
		System.out.println("Name of t1 after changes:"+t2.getName());
	}
}

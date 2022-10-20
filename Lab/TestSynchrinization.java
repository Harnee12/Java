//HARNEE A
//CG2576
//Program to Static synchronization
class Table//class creation
{
	synchronized static void PrintTable(int n)//static synchronized method
	{
		for(int i=1;i<=10;i++)//for loop
		{
			System.out.println(n*i);//print the table
			try//try block for sleep
			{
				Thread.sleep(500);//sleep method
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class MyThread1 extends Thread//extending class from thread
{
	public void run()//run method
	{
		Table.PrintTable(1);//print the 1th table
	}
}
class MyThread2 extends Thread
{
	public void run()//run method
	{
		Table.PrintTable(10);//print the 10th table
	}
}
class MyThread3 extends Thread
{
	public void run()//run method
	{
		Table.PrintTable(100);//print the 100th table
	}
}
public class TestSynchrinization
{
public static void main(String[] args)
{
	MyThread1 t1=new MyThread1();//object creation for thread classes
	MyThread2 t2=new MyThread2();
	MyThread3 t3=new MyThread3();
	t1.start();//start the thread
	t2.start();
	t3.start();
	}
}



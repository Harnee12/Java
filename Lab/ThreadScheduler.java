 //HARNEE A
 //CG2576
 //Program to reate thread using ThreadSchedular methods sleep(),join()
class ThreadScheduler extends Thread//extending class from thread
{
	public void run()//run method
	{
		for(int i=1;i<=5;i++)
		{
			try//try block for sleep method
			{
				Thread.sleep(1000);//sleep the thread for 1 millisecs
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);//print the i value
		}
	}
	public static void main(String[] args)
	{
		ThreadScheduler t1=new ThreadScheduler();//creating object with thread
		ThreadScheduler t2=new ThreadScheduler();
		ThreadScheduler t3=new ThreadScheduler();
		t1.start();//start the thread 1st time
		try//try block for join 
		{
			t1.join();//join method
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();//start the thread 2nd time
		t3.start();//start the thread 3rd time
	}
}
		
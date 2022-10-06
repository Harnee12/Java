//HARNEE A
//CG2576
//Encapsulation
class Encapsulation
{
	private int sid;//data members
	private String sname;
	public void setSid(int x)//setter
	{
		sid=x;
	}
	public void setSname(String y)//setter
	{
		sname=y;
	}
	public int getSid()//getter
	{
		return sid;
	}
	public String getSname()//getter
	{
		return sname;
	}

	public static void main(String[] args)
	{
		Encapsulation e=new Encapsulation();//object creation
		e.setSid(10);
		e.setSname("hari");
		System.out.println(e.getSid());
		System.out.println(e.getSname());
		

	}

}
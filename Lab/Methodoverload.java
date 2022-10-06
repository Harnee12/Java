//HARNEE A
//CG2576
//Swap of integers and double using method overloading
class Methodoverload//class creation
{
	void swap(int x,int y)//method creation
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println(x+" "+y);
	}
	void swap(double x,double y)//methodoverloading
	{
		double temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println(x+" "+y);
	}
	public static void main(String[] args)
	{
		Methodoverload m=new Methodoverload();//object creation
		m.swap(12,15);//calling integer method
		m.swap(200.98,400.87);//calling double method
	}
}
		
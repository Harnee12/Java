//Write a program using unary operators
class UnaryOperation
{
	public static void main(String[] args)
	{
	 int x=2;
     int y=++x;
  int z=x++ + ++y;
int m=x++ + ++x + y++ - z--;
System.out.println(x+" "+y+" "+z+" "+m);
}
}

//HARNEE A
//CG2576
//Program to print all types of variables
class Variables
{
int x=5;//instance variable
static int y=2;//static or calss variable
void m1() //method area
{
int z=10;//local variable
System.out.println(z);
}public static void main(String[] args)
{
Variables obj=new Variables();
System.out.println(obj.x);
System.out.println(y);
}
}
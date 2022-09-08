//HARNEE A
//CG2576
//Program to print all types of operators
class Operators
{
public static void main(String[] args)
{
int x,y,n,p,q;
boolean z,m;
x=5;//assignment
y=x*2;//arithematic
x/=2;//multiple
z=(x>=y);//relational
m=(x>20 && x<100);//logical
n=x++;//unary
p=(x>y)?1:0;//ternary
q=(x^y);//bitwise
System.out.println(x+" "+y+" "+z+" "+m+" "+n+" "+p+" "+q);
}
}


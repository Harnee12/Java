//HARNEE A
//CG2576
//3)c) Display the following sequence
//0 1 1 2 3 5 8 
class Fibonacci
{public static void main(String[] args)
{ int a=0,b=0,c=1;//Assign variables
do
{ 
a=b;
b=c;
c=a+b;
System.out.println(a+" ");
}while(c<=20);
}
}
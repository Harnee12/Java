//HARNEE A
//CG2576
//1)Program to find largest of 3 numbers
import java.util.Scanner;
class Ifelse
{
public static void main(String[] args)
{ int a,b,c;//variable declaration
//Getting inputs from user
System.out.println("Enter he numbers");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
 System.out.println(a+" is big");
else if(b>a && b>c)
 System.out.println(b+" is big");
else if(c>a && c>b)
 System.out.println(c+" is big");
else
 System.out.println("All are equal");
}}

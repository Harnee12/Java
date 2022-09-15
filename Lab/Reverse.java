//HARNEE A
//CG2576
//2)Program to print reverse of a number
import java.util.Scanner;
class Reverse
{ public static void main(String[] args)
{int n,rev=0,r;//variable declaration
//getting input from user
System.out.println("enter number n");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
do
{ r=n%10;
 rev=(rev*10)+r;
 n=n/10;
}while(n>0);
 System.out.println("Reverse of the number="+rev);//print
}}
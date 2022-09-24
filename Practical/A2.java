//Program to print array in reverse order
import java.util.Scanner;
class A2
{public static void main(String[] args)
{int[] a=new int[4];
System.out.println("Enter array elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=3;i++)
{a[i]=sc.nextInt();
}
System.out.println("reverse order");
for(int i=3;i>=0;i--)
{
System.out.println(a[i]);
}
}}
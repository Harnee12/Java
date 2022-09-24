// count the elements
import java.util.Scanner;
class A7
{
 public static void main(String[] args)
{
int[] a=new int[4];
int ele,count=0;
System.out.println("enter arrray elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=3;i++)
{
 a[i]=sc.nextInt();
}
System.out.println("enter element");
ele=sc.nextInt();
for(int i=0;i<=3;i++)
{
if(a[i]==ele)
count++;
}
System.out.println("the number is "+count+" time presented");
}}

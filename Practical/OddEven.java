//find odd and even numbers in array
import java.util.Scanner;
class OddEven
{
public static void main(String[] args)
{
int[] a=new int[5];
System.out.println("Enter array elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=4;i++)
{ 
a[i]=sc.nextInt();
}
System.out.println("Odd numbers");
for(int i=0;i<=4;i++)
{ 
if(a[i]%2!=0)
{
	System.out.println(a[i]+" ");
}
}
System.out.println("Even numbers");
for(int i=0;i<=4;i++)
{ 
if(a[i]%2==0)
{
	System.out.println(a[i]+" ");
}
}
}
}
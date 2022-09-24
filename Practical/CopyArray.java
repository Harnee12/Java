//copy one array to another
import java.util.Scanner;
class CopyArray
{
public static void main(String[] args)
{
int[] a=new int[4];
int[] b=new int[4];
System.out.println("Enter array elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=3;i++)
{ 
a[i]=sc.nextInt();
}
System.out.println("copied array");
for(int i=0;i<=3;i++)
{
	b[i]=a[i];
	System.out.println(b[i]+" ");
}
}
}
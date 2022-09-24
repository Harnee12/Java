//addition of two arrays
import java.util.Scanner;
class A8
{public static void main(String[] args)
{int[] a=new int[4];
int[] b=new int[4];
int[] c=new int[4];
System.out.println("Enter first array ");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=3;i++)
{ a[i]=sc.nextInt();
}
System.out.println("Enter second array ");
for(int i=0;i<=3;i++)
 {
  b[i]=sc.nextInt();
}
System.out.println("the result array ");
for(int i=0;i<=3;i++)
{
c[i]=a[i]+b[i];

System.out.print(c[i]+" ");
}
}
}
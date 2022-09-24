//Sum of the elements in array
import java.util.Scanner;
class A1
{public static void main(String[] args)
{int[] a=new int[4];
int sum=0;
System.out.println("enter array elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=3;i++)
{ a[i]=sc.nextInt();
 sum=sum+a[i];
}
System.out.println("the sum is"+sum);
}
}
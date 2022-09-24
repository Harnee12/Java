//program to print maximum element in array
import java.util.Scanner;
class A3
{public static void main(String[] args)
{int[] a=new int[4];
int max=0;
System.out.println("enter array elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=3;i++)
{a[i]=sc.nextInt();
if(max<=a[i])
{max=a[i];
}
}
System.out.println("maximum element"+max);
}
}
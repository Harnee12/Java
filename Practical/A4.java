//minimum element in array
import java.util.Scanner;
class A4
{public static void main(String[] args)
{int[] a=new int[4];
int min=a[0];
System.out.println("enter array elements");
Scanner sc=new Scanner(System.in);
a[0]=sc.nextInt();
min=a[0];
for(int i=1;i<=3;i++)
{a[i]=sc.nextInt();
if(min>a[i])
{min=a[i];
}
}
System.out.println("minimum element"+min);
}
}
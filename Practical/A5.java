//search the element in array
import java.util.Scanner;
class A5
{public static void main(String[] args)
{int[] a=new int[4];
int key;
boolean flag=false;
System.out.println("Enter array elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=3;i++)
{a[i]=sc.nextInt();
}
System.out.println("enter key");
key=sc.nextInt();
for(int i=0;i<=3;i++)
{ if(a[i]==key) 
    {flag=true;
break;
}
}
if(flag==true)
System.out.println("key is found");
else
System.out.println("key is not found");
}}
//HARNEE A
//CG2576
//3)Print maximum and minimum element in array using methods
import java.util.Scanner;
class Methods
{ int[] a=new int[4];//declare the array
void maximum()
{
int max=0;//initialize the max value
System.out.println("enter array elements");//get the array
Scanner sc=new Scanner(System.in);
for(int i=0;i<=3;i++)
{
a[i]=sc.nextInt();
if(max<=a[i])//check the condition using if 
{
max=a[i];
}
}
System.out.println("maximum element"+max);//print the maximum value in array
}
void minimum()
{
int min=a[0];
System.out.println("enter array elements");//get the array
Scanner sc=new Scanner(System.in);
a[0]=sc.nextInt();
min=a[0];
for(int i=1;i<=3;i++)
{
a[i]=sc.nextInt();//print the array
if(min>a[i])//check the condition using if
{
min=a[i];
}
}
System.out.println("minimum element"+min);//print minimum value
}
public static void main(String[] args)
{ 
Methods m1=new Methods();//m1 is object
  m1.maximum();//call the maximum method using object
  m1.minimum();//call the minimum method using object
}}

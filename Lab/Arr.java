//HARNEE A
//CG2576
//4)find duplicate and copy in another array
import java.util.Scanner;
class Arr
{
public static void main(String[] args)
{
int[] a=new int[4];//declare the arrays
int[] b=new int[4];
System.out.println("Enter array elements");//get the array
Scanner sc=new Scanner(System.in);
for(int i=0;i<=3;i++)
{
a[i]=sc.nextInt();//print the array
}
System.out.println("duplicate elements");
for(int i=0;i<=3;i++)
{
for(int j=i+1;j<=3;j++)
{
if(a[i]==a[j])//check the duplicate elements
for(int k=0;k<=1;k++)
{
b[k]=a[j];
System.out.println(b[k]+" ");//copied array
}
}}
}}
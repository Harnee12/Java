//HARNEE A
//CG2576
//1)addition,multiplication and transpose of 2D arrays
import java.util.Scanner;
class Arrays
{
public static void main(String[] args)
{
int[][] a=new int[2][2];//declare the arrays
int[][] b=new int[2][2];
int[][] c=new int[2][2];
int ch;
System.out.println("Enter first array ");//get the first array
Scanner sc=new Scanner(System.in);
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
 a[i][j]=sc.nextInt();//print the first array
}
}
System.out.println("Enter second array ");//get the second array
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
 {
  b[i][j]=sc.nextInt();//print the second array
}
}
System.out.println("1 addition");//print the choices
System.out.println("2 multiplication");
System.out.println("3 transpose");
System.out.println("4 exit");
System.out.println("Enter the choice");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("addition of 2 arrays ");//addition of 2 arrays
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
break;
case 2:
System.out.println("multiplication of 2arrays");//multiplication of 2 arrays
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
c[i][j]=0;
for(int k=0;k<=1;k++)
c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
System.out.print(c[i][j]+" ");
}
System.out.println();
}
break;
case 3:
System.out.println("transpose of array");//transpose of  first array
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{System.out.print(a[j][i]+" ");
}
System.out.println();
}
break;
case 4:
{
System.out.println("no choice exit");//here no choices
}
}
}}

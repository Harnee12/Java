//HARNEE A
//CG2576
//5)sum of two numbers if the input is char 'y' otherwise stop
import java.util.Scanner;
class Addition
{
public static void main(String[] args)
{ int a,b,c;
 char d;
System.out.println("Enter integer elements");//get the integers
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("enter character");//get the character
d=sc.next().charAt(0);
if(d=='y' || d=='Y')
{ 
c=a+b;//calculate the sum
System.out.println("the sum is "+c);//print the sum value
}
else 
System.out.println("Stop the process");//otherwise stop
}
}
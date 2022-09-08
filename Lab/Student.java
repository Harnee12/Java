//HARNEE A
//CG2576
//Program to print a student details using "Scannaer class"
import java.util.Scanner;
class Student
{
public static void main(String[] args)
{
int sid;//integer variable
String sname;//String variable
double satt;//double variable
System.out.println("Enter the students details");
Scanner sc=new Scanner(System.in);
sid=sc.nextInt();
sname=sc.next();
satt=sc.nextDouble();
System.out.println(sid+" "+sname+" "+satt);
}
}
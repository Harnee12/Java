//HARNEE A
//CG2576
//To input int,String,double,boolean details using "Scanner" class?
import java.util.Scanner;  //Scanner class package
class ScannerTest
{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);
   //to get integer input using scanner class   
   System.out.println("Enter your rollno");  
   int rollno=sc.nextInt();  
   //to get string input using scanner class 
   System.out.println("Enter your name");  
   String name=sc.next();  
   //to get double input using scanner class 
   System.out.println("Enter your fee");  
   double fee=sc.nextDouble();  
   //print all the details
   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  
   sc.close();  //close the program
 }  
}   
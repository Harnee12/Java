//HARNEE A
//CG2576
//Write a program with PrintWriter class and store different data details into "abc.txt" file
import java.io.*;  //file handling package
class PrintStreamTest//class creation
{  
 public static void main(String args[])throws Exception//main method with throws exception
 {  
   FileOutputStream fout=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\abc.txt");  //file creation
   PrintStream pout=new PrintStream(fout);  //to print the details into file using printstream class
   pout.println(1900);  //printing 1nteger value
   pout.println("Hello Java");  //printing string values
   pout.println("Welcome to Java");  
   pout.close();  //close the printstream class
   fout.close();  //close the file
 }  
}   
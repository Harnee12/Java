//HARNEE A
//CG2576
//Program to prepare Console class with password method
import java.io.*;  //file handling package
class ReadPasswordTest//class creation
{  
public static void main(String args[])//main method
{  
Console c=System.console(); //create console class to get input from user 
System.out.println("Enter password: "); //enter the password 
char[] ch=c.readPassword();  //get the password as character array
String pass=String.valueOf(ch);//converting char array into string  
System.out.println("Password is: "+pass);  //display the password
}  
}   

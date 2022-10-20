//HARNEE A
//CG2576
//Program to print student details in forwarding and backwarding usig listiterator
import java.util.*;
class Student//class creation
{ 
int rollno; //data members
String name; 
int age; 
Student(int rollno, String name, int age)//param constructor
{ 
this.rollno = rollno; 
this.name = name; 
this.age = age; 
} 
public String toString()//tostring method
{
return rollno+" "+name+" "+age;
}  
}
public class TestListiterator
{  
public static void main(String args[])
{    
ArrayList<Student> al = new ArrayList<Student>(); //arraylist for geting the student details
al.add(new Student(101, "Vijay", 23)); 
al.add(new Student(106, "Ajay", 27)); 
al.add(new Student(105, "Jai", 21)); 
  
ListIterator itr=al.listIterator();  //print the listliterator using forward and backward
  
System.out.println("traversing elements in forward direction...");  
while(itr.hasNext())//for forwarding direction
{  
System.out.println(itr.next());  
 }   
System.out.println("traversing elements in backward direction...");  
while(itr.hasPrevious())//for backwarding direction
{  
System.out.println(itr.previous());  
 }  
}  
}  
//HARNEE A
//CG2576
//Program to queue collection using methods[peek(),remove(),poll()]
import java.util.*;  
class TestQueue
{  
public static void main(String args[])
{  
PriorityQueue<String> queue=new PriorityQueue<String>();//get the String values using priorityqueue
queue.add("Amit");  //adding element inti the queue
queue.add("Vijay");  
queue.add("Karan");  
queue.add("Jai");  
queue.add("Rahul");  
System.out.println("head:"+queue.peek());  //peek method[it retrives ,does not remove]
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator(); //print the queue elements 
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
System.out.println("head:"+queue.remove());//remove method[it retrives,remove]
System.out.println("after removing first element"); 
Iterator<String> itr1=queue.iterator(); //print the queue elements after removing first element 
while(itr1.hasNext())
{  
System.out.println(itr1.next());  
}   
System.out.println("head:"+queue.poll());//poll method[it retrives,remove]  
System.out.println("after removing second elements:");  
Iterator<String> itr2=queue.iterator();  //print the queue elements after removing second element
while(itr2.hasNext())
{  
System.out.println(itr2.next());  
}  
}  
}  

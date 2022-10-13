//HARNEE A
//CG2576
//Wrp using String manipulation methods 
public class Stringdemo
{
public static void main(String[] args)
{
	String s1="sai";//Stringliterals declaration
	String s2="siva";
	String s3="sai";
	String s4=new String("siva");//String new declaration
	//Checking == [it checks reference]
	System.out.println(s1==s3);
	System.out.println(s2==s4);
	//checking equals() method [it checks value]
	System.out.println(s1.equals(s3));
	System.out.println(s2.equals(s4));
	//using concat() method
	System.out.println(s2.concat("ram"));
	//using replace() method
	System.out.println(s2.replace("siva","sai"));
	System.out.println(s2);
	//using charAt() method
	System.out.println(s1.charAt(1));
	//using compareTo() method
	System.out.println(s1.compareTo(s2));
	//using substring() method
	System.out.println(s2.substring(3));
	System.out.println(s2);
}
}
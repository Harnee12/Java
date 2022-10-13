//HARNEE A
//CG2576
//wrp to perform StringBuffer class methods
public class StringBufferdemo
{
	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("sita");//StringBuffer new declaration
		StringBuffer s2=new StringBuffer("ram");
		//checking == [it checks address only]
		System.out.println(s1==s2);
		//checking equals() [it checks address only]
		System.out.println(s1.equals(s2));
		//using append() method
		System.out.println(s1.append(s2));
		System.out.println(s1);
		//using delete() method
		System.out.println(s1.delete(4,7));
		System.out.println(s1);
		//using insert() method
		System.out.println(s1.insert(4,"ramam"));
		System.out.println(s1);
		//using reverse() method
		System.out.println(s2.reverse());
		System.out.println(s2);
	}
}
		
	
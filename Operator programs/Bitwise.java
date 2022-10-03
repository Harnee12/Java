//Write a program using bitwise operators
import java.util.Scanner;
class Bitwise
{
	public static void main(String[] args)
	{
		int a,b;
		System.out.println("Enter the elements a,b");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Bitwise operators ");
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a<<2);
		System.out.println(a>>2);
		System.out.println(~(a));
	}
}

		
	
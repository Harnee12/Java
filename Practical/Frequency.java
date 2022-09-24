//Frequency of element in array
import java.util.Scanner;
class Frequency
{
public static void main(String[] args)
{
int[] a=new int[4];
int[] b=new int[4];
int visited=-1;
System.out.println("Enter array elements");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=3;i++)
{ 
a[i]=sc.nextInt();
}
for(int i=0;i<=3;i++)
{
	int count=1;
	for(int j=i+1;j<=3;j++)
	{
		if(a[i]==a[j])
		{
			count++;
			b[j]=visited;
		}
	}
	if(b[i]!=visited)
		b[i]=count;
}
for(int i=0;i<=3;i++)
{
	if(b[i]!=visited)

		System.out.println("Element:"+a[i]+" Frequency:"+b[i]);
}
}
}
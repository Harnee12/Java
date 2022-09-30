//HARNEE A
//CG2576
//Program to create one class with constructor,inctance methods,anonymous,static method 
abstract class Draw//abstract class
 {
	 abstract void add();//abstract method
 }
 class Shape//declare class name
 {
	 int a,b;//data members
	 static String s="circle";
	 Shape()//constructor
	 {
		 System.out.println("This is the constructor method");
	 }
	 void sub()//instance method
	 {
		 int a=10;
		 int b=20;
		 System.out.println("The subraction  is "+(a-b));
	 }
	 static void change()//static method
	 {
		 s="Rectangle";//change the static value in static method
		 System.out.println(s);
	 }
	 public static void main(String[] args)//main method
	 {
		 Draw m=new Draw()//Anonymous method
		 {
			 void add()//abstract method implementation
			 {
				 int a=12;
				 int b=15;
				 System.out.println("The addition value is "+(a+b));
			 }
		 };
		 m.add();//calling abstract method
		 Shape n=new Shape();//object creation for constructor
		 n.sub();//calling instance method
		 Shape.change();//calling static method using classname
	 }
 }
		 
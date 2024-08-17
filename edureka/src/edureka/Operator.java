package edureka;

public class Operator {
	public static void main(String[]args){
	int a=8;
	int b=5;
	//Arthimatic operator
	System.out.println("Arthimatic operator");
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	
	//unary operator + logical operator 
	   System.out.println("Unary operator,logical operator");   
	   int x= 10;
	   System.out.println(x++);
	   System.out.println(++x);
	   System.out.println(x--);
	   System.out.println(--x);
	   
	   
	  //shift operator
	   System.out.println("Shift operator");
	   System.out.println(10<<2);
	   System.out.println(22<<2);
	   System.out.println(45<<3);
	   System.out.println(10<<4);
	   
	   System.out.println("Relation operator");
	   int ra=8;
	   int rb=9;
	   int rc=20;
	   System.out.println(ra<rb&&ra<rc);
	   System.out.println(ra<rb&ra<rc);
	   
	   
	   System.out.println("Bitwise operator");
	   int num1=10;
	   int num2 =5;
	   int num3 =20;
	   System.out.println(num1<num2&&num1++<num3);
	   System.out.println(num1);
	   System.out.println(num1<num2&num1++<num3);
	   System.out.println(num1);
	   System.out.println(num1<num2&&num1++<num3);
	   
	   //ternary operator
	   int num4 =2;
	   int num5 =5;
	   
	   
}}

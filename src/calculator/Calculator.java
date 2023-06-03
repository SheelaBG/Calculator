package calculator;

public class Calculator {
	
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is :"+sum);
	}
	public static void mul(int a, int b)
	{
		int mul=a*b;
		System.out.println("mul is :"+mul);
	}
	public static void sub(int a, int b)
	{
		int sub=Math.abs(a-b);
		System.out.println("sub is :"+sub);
	}
	public static void div(int a,int b)
	{
		int div=Math.abs(a/b);
		System.out.println("div is :"+div);
	}
	
	public static void main(String[] args) {
		add(10,20);
		mul(20,10);
		sub(2,10);
		div(20,10);
	}

}
 

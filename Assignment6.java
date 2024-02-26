package assignments;
import java.util.Scanner;
public class Assignment6 {
	
	static void add()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s1.nextInt();
		System.out.println("Enter Value of b");
		int b=s1.nextInt();
		System.out.println("Addition of two numbers");
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void subtract()
	
	{Scanner s1=new Scanner(System.in);
	System.out.println("Enter value of a");
	int a=s1.nextInt();
	System.out.println("Enter Value of b");
	int b=s1.nextInt();
	System.out.println("Subtraction of two numbers");
	int sum=a-b;
	System.out.println(sum);
	}
	
	static void multiplication()
	
	{Scanner s1=new Scanner(System.in);
	System.out.println("Enter value of a");
	int a=s1.nextInt();
	System.out.println("Enter Value of b");
	int b=s1.nextInt();
	System.out.println("Multiplication of two numbers");
	int result=a*b;
	System.out.println(result);
	}
	
	static void division()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s1.nextInt();
		System.out.println("Enter Value of b");
		int b=s1.nextInt();
		System.out.println("Division of two numbers");
		int sum=a/b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		add();
		subtract();
		multiplication();
		division();
		
	}

}

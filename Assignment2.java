package assignments;
public class Assignment2
{
static void addition()
	{
	int a=20;
	int b=30;
	int sum=a+b;
	System.out.println(sum);
	}
static void subtraction()
	{
	int a=50;
	int b=30;
	int result=a-b;
	System.out.println(result);
	}
void multiplication()
	{
	int a=20;
	int b=60;
	int output=a*b;
	System.out.println(output);
	}
void division()
	{ 
	int a=100;
	int b=20;
	int div=a/b;
	System.out.println(div);
	}
public static void main(String[] args) 
{
		addition();
		subtraction();
		Assignment2 a1=new Assignment2();
		a1.multiplication();
		a1.division();
		

	}

}

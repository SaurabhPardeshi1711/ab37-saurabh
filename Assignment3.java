package assignments;
public class Assignment3 
{
		static void add(int a)
		{
			int sum=a+10;
			System.out.println(sum);
		}
		static void add(double c)
		{
			double a=c+9.9;
			System.out.println(a);
		}
		void add(char a)
		{
			char e=a;
			System.out.println(e);
		}
		void dinner(boolean a)
		{
		System.out.println("I had");
		}
		void dinner(String a)
		{
			System.out.println("I am yet to have a dinner");
		}

		public static void main(String[] args) 
		{
			add(20);
			add(55.89);
			Assignment3 a3=new Assignment3();
			a3.add('S');
			a3.dinner(true);
			a3.dinner("i am ready");

	}

}

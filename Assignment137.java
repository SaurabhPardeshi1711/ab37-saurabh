package packageone;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Assignment137
{
	@BeforeSuite
	public void bs()
	{
			System.out.println("Before Suite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method");
	}
	@Test
	public void testcase1()
	{
		System.out.println("Test");
	}
}

package packageone;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Assignment_139 
{
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void am()
	{
		
		System.out.println("After Method");
	}
	@Test
	public void test1()
	{
	System.out.println("Test Case1");
	}
	@Test
	public void test2()
	{
	System.out.println("Test Case2");
	}

}

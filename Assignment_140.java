package packageone;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_140 
{
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method");
	}
	@Test
	public void abc()
	{
		System.out.println("Test Case1");
	}
	@Test
	public void pqr()
	{
		System.out.println("Test Case2");
	}
	@Test
	public void xyz()
	{
		System.out.println("Test Case3");
	}
}

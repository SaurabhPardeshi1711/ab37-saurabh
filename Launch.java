package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Launch
{
	public static void main(String[] args)
	{
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.flipkart.com/");
		//System.out.println(c1.getWindowHandle());
		//System.out.println(c1.getWindowHandles());
		System.out.println(c1.getTitle());
	}

}

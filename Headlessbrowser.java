package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessbrowser {

	public static void main(String[] args)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		
	}

}

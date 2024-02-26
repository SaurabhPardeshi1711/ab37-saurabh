package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();//code to maximize your browser
		driver.findElement(By.id("email")).sendKeys("stbymkt@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abcd1234*");
		driver.findElement(By.name("login")).click();
		
		

	}

}

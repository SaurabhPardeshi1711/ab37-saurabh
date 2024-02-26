package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToInstagram {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("stbymkt@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd1234*");
		driver.findElement(By.name("Login")).click();
		
		

	}

}

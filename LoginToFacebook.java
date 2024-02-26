package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook 
{
public static void main(String[] args) 
{

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("stbymkt@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("uygftc65rf");
	driver.findElement(By.name("login")).click();
}
}

package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGrotechminds {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("lname")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("Username")).sendKeys("Saurabh Kiran Pardeshi");
		driver.findElement(By.id("Username")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("Username")).sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");
		
		
		
	}

}

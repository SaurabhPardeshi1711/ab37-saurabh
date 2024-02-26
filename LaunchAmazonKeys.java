package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchAmazonKeys 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchDropdownBox")).click();
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("software");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
	}

}

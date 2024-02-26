package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlApplication {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/spardeshi3/OneDrive%20-%20DXC%20Production/Saurabh/Automation%20Testing/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("saurabh123");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("abcd");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("abcd1234*");
		driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).sendKeys("saurabh");
		driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();		
		driver.findElement(By.tagName("a")).click();	
		
		
		

	}

}

package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTowmA {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://170.30.66.58:9082/wma/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@style='width:100px']")).click();
		driver.findElement(By.xpath("//input[@id='mainform:userId']")).sendKeys("saurabh");
		driver.findElement(By.xpath("//input[@id='mainform:userPassword']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@id='mainform:loginAction']")).click();

	}

}

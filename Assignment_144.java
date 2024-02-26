package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assignment_144 
{
	
	@Test
	public void method1()
	{
		
	}
	
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.name("email")).sendKeys("8976288084");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("DXC@2024");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("nav-a nav-a-2 nav-truncate   nav-progressive-attribute")).click();
		driver.findElement(By.xpath("//a[@id=nav-item-signout']")).click();
		
	
		
		
		
		
	}

}

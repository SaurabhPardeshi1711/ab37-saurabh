package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links_Text {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links is:" + links.size());
		
		for(int i=0; i<=links.size()-1; i++)
		{
		WebElement a=	links.get(i);
		String text_message= a.getText();
		System.out.println(text_message);
			
		}
				
	}

	

}

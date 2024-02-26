package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();//launch empty browser
		driver.navigate().to("https://www.grotechminds.com");
		//driver.get("https://www.google.com");//take u to particular website
		driver.manage().window().maximize();
		Thread.sleep(3000);//giving sleep so u guys can capture with eyes pgm running fine
		driver.navigate().back();
		Thread.sleep(3000);//sleeping for 3 sec
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();//refresh any browser/website 
	}

}

package browsers_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_website 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_SETUP\\BROWSERS DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
}

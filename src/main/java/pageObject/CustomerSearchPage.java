package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerSearchPage 
{
	WebDriver wd;
	
	public void EnterRIM(WebDriver wd)
	{
		this.wd = wd;
		
		//Insert RIM Search
		wd.findElement(By.cssSelector("input[name = '100000002']")).sendKeys("1234");
					
		//Search
		wd.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
	
	}
}

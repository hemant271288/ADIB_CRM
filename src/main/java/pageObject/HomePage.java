package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	WebDriver wd;
	
	public void ClickServiceRequest(WebDriver wd)
	{
		this.wd = wd;

		//Click on Service Request
		
		wd.findElement(By.cssSelector("i[title = 'Service Request']")).click();
	}
		
}

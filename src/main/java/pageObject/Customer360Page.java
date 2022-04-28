package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Customer360Page
{
WebDriver wd;
	
	public void ClickGSR (WebDriver wd) throws InterruptedException
	{
		this.wd = wd;

		//Open Cases
		wd.findElement(By.xpath("//header/div[2]/span[2]/i[1]")).click();
		Thread.sleep(3000);
		
		//Hovering on New Case
		Actions a = new Actions(wd);
	    a.moveToElement(wd.findElement(By.cssSelector("a[title='New Case']"))).build().perform();
	    Thread.sleep(3000);
	    
	    //Click on GSR 
	    wd.findElement(By.xpath("//span[contains(text(),'General Service Request')]")).click();
	    
	}
}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GSRdetailPage
{
	WebDriver wd;
	
	public void GSRdetail(WebDriver wd)
	{
		this.wd = wd;

		WebElement element = wd.findElement(By.cssSelector("span[data-autoid = 'CASE_NUMBER_ctrl']"));
	    String ID = element.getAttribute("title");
	    
	    WebElement element1 = wd.findElement(By.cssSelector("span[data-autoid = 'cust_11967_ctrl']"));
	    String Status = element1.getAttribute("title");
	    
	    WebElement element2 = wd.findElement(By.cssSelector("span[data-autoid = 'CASE_REPORTEDON_ctrl']"));
	    String Time = element2.getAttribute("title");
	    
	    System.out.println("CRM ID is : "+ID);
	    System.out.println("BPM status is : "+Status);
	    System.out.println("Date and Time is : "+Time);
	    System.out.println("..............................");
	}
}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServiceRequestPage 
{
	WebDriver wd;
	
	public void SelectRequest(WebDriver wd) throws InterruptedException
	{
		
		//Service Category
	    wd.findElement(By.cssSelector("a[data-autoid = 'CASE_CATEGORY_srch']")).click();
	    wd.findElement(By.cssSelector("div[title = 'Account Services']")).click();
	    
	    //Service Sub Category
	    wd.findElement(By.cssSelector("a[data-autoid = 'CASE_SUBCATEGORY_srch']")).click();
	    wd.findElement(By.cssSelector("div[title = 'ADIB Egypt']")).click();
	    
	    //Service Sub Sub Category
	    wd.findElement(By.cssSelector("a[data-autoid = 'CASE_SUBCATEGORY1_srch']")).click();
	    wd.findElement(By.cssSelector("div[title = 'Customer Maintenance Update']")).click();
	    
	    /*/System.out.println(sc);
	    
	    //if(sc.equals("Miscellaneous"))
	    {
	    	System.out.println("In Loop");
	    	//Account Details
		    JavascriptExecutor js = (JavascriptExecutor)wd;
		    js.executeScript("window.scrollBy(0,900)");
	    	wd.findElement(By.cssSelector("a[data-autoid='cust_12064_srch']")).click();
	    	wd.findElement(By.cssSelector("div[title='26821894']")).click();
	    } */
	    //Save and Proceed
	    wd.findElement(By.cssSelector("a[data-autoid='FlowNext']")).click();
	    Thread.sleep(2000);
	    
	    //Home Again
	    wd.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/i[1]")).click();
	}
	
}

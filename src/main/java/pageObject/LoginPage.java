package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
WebDriver wd;
	
	public void Login(WebDriver wd)
	{
		this.wd = wd;
		
		wd.findElement(By.name("UserName")).sendKeys("omar");
		wd.findElement(By.id("TxtPassword")).sendKeys("acid_qa");
		wd.findElement(By.name("command")).click();	
	}
	
	public void Logout(WebDriver wd)
	{
		this.wd=wd;
		wd.findElement(By.cssSelector("img[name='ProfileImage_header']")).click();
		wd.findElement(By.cssSelector("a[title=\"Logout\"]")).click();
	}
	
	public void QuitBrowser(WebDriver wd)
	{
		this.wd=wd;
		wd.quit();
	}
	
	
	
	
	
}

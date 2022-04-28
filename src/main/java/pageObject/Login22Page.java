package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login22Page
{
	WebDriver wd;
	
	public Login22Page(WebDriver wd)
	{
		this.wd = wd;
		PageFactory.initElements(wd,this);
	}
	
	//By username = By.name("UserName");
	//By password = By.id("TxtPassword");
	//By login = By.name("command");
	
	@FindBy(name="UserName")
	WebElement username;
	
	@FindBy(id="TxtPassword")
	WebElement password;
	
	@FindBy(name="command")
	WebElement login;
	
	
	public void username() 
	{
		username.sendKeys("test");
	}
	//public WebElement username()
	//{
		//username.sendKeys("omar");
		//return login;
	//}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement login()
	{
		return login;
	}

}

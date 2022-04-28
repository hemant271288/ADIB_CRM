package ADIBTestCase;

import java.io.IOException;
import pageObject.*;
import org.testng.annotations.Test;
import resources.base;

public class HomeTestCase extends base
{
	@Test
	public void basePageNavigation() throws IOException
	{
		wd = initializeDriver();
		
		LoginPage lg = new LoginPage();  //Login
		lg.Login(wd);
		lg.QuitBrowser(wd);
	
		/*
		LoginPage lp = new LoginPage(wd);
		//lp.username();
		lp.username().sendKeys("omar");
		lp.password().sendKeys("acid_qa");
		lp.login().click();
		*/
	}
		
}

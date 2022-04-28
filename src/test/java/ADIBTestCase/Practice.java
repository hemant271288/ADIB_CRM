package ADIBTestCase;

import java.io.IOException;
import org.testng.annotations.Test;
import pageObject.*;
import resources.base;

public class Practice extends base
{
	@Test
	public void HappyFlow() throws IOException, InterruptedException
	{
		wd = initializeDriver();
		
		LoginPage lg = new LoginPage(); 
		lg.Login(wd);
		
		HomePage hp = new HomePage();
		hp.ClickServiceRequest(wd);
		
		CustomerSearchPage cs = new CustomerSearchPage();
		cs.EnterRIM(wd);
		
		Customer360Page cp = new Customer360Page();
		cp.ClickGSR(wd);
		
		ServiceRequestPage sr = new ServiceRequestPage();
		sr.SelectRequest(wd);
		
		lg.Logout(wd);	
		lg.QuitBrowser(wd);
	
	}
}

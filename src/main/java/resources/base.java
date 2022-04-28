package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{
	public WebDriver wd;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Hemant Pandey\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		System.out.println(url);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
			wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.get(url);
				
		}
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		return wd;	
		
	
		
	}
	
}


package testCases;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass  {
public WebDriver driver;
public Logger logger;
public Properties p;

	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String br) throws IOException  {
		logger=LogManager.getLogger(this.getClass());
		
		switch (br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();
		break;
		case "firefox":driver=new FirefoxDriver();
		break;
		case "edge":driver=new EdgeDriver();
		break;
		case "internetexplorer":driver=new InternetExplorerDriver();
		break;
		default:System.out.println("invalid Browser");
			return;
			
			

		
		}
		
		//
		FileReader file=new FileReader(".\\src\\test\\resources\\Config.properties");
		p=new Properties();
		p.load(file);
	
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--remote-allow-origins");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("appUrl"));
		
	}


@AfterClass
	public void tearDown() 
	{
		driver.close();
	}

public String randomString() {
	
	return randomString();
}
	
	
	
}

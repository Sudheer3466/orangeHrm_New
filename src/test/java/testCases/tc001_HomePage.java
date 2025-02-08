package testCases;

import java.time.Duration;
import java.util.*;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.opentelemetry.api.internal.StringUtils;
import net.bytebuddy.utility.RandomString;
import pageObjects.HomePage;

public class tc001_HomePage extends BaseClass {
@Test
	public void LoginValidation()
	{



	logger.info("***** Enter valid ( User Name & Password ) ******");
		HomePage hp=new HomePage(driver);
		hp.txt_UserName(p.getProperty("UserName"));
		hp.txt_password(p.getProperty("Password"));
		logger.info("***Click Login Button****");
		hp.btn_LoginBtn();
		
		

	}
}



	




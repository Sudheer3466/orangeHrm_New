package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.*;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.opentelemetry.api.internal.StringUtils;
import net.bytebuddy.utility.RandomString;
import pageObjects.HomePage;

public class tc001_HomePage extends BaseClass {


	@Test(dataProvider = "LoginData", dataProviderClass = LoginDataProvider.class)
	public void LoginValidation(String user,String pwd,String result)
	{
		logger.info("***** Enter valid ( User Name & Password ) ******");
		HomePage hp=new HomePage(driver);

		//System.out.println(result);

		hp.txt_UserName(user);
		hp.txt_password(pwd);
		logger.info("***Click Login Button****");
		hp.btn_LoginBtn();

		boolean DashBoard=driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
		int i=0;
		if(DashBoard==true)
		{
			if (result.equalsIgnoreCase("valid")) {
				Assert.assertTrue(true);
				driver.close();
				
			}
			else {
				i++;
				System.out.println("Round (Positive Cases)---->"+ i);
				Assert.assertTrue(false);
			}
			if(DashBoard==false)
			{
				if (result.equalsIgnoreCase("Invalid")) {
					Assert.assertTrue(true);	
					
				}
				else {
					i++;
					System.out.println("Round (Negative Cases)---->"+ i);
					driver.close();
					Assert.assertTrue(false);
				}
			}}
	}
}














package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TC002_LoginDetails extends BaseClass {

	 @Test
		public void LoginValidation()
	 {
		
		HomePage hp=new HomePage(driver);
		hp.txt_UserName("Admin");
		hp.txt_password("admin123");
		logger.info("***Click Login Button****");
		hp.btn_LoginBtn();
		
	}
}

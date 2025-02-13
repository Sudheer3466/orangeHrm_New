package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TC003_OrangeHrm_Login extends BaseClass {
	
	
	@Test
	public  void login() {
		
	 {
	
	HomePage hp =new HomePage(driver);
	hp.txt_UserName("admin");
	hp.txt_password("admin123");
	hp.btn_LoginBtn();
	
	
	}
	

	}
}

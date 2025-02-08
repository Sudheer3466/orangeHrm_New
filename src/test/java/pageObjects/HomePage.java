package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	WebDriver driver;

	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy (xpath="//input[@placeholder='Username']") WebElement txt_userName;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_userpwd;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_LoginBtn;
	
	
	public void txt_UserName(String username) {
		txt_userName.sendKeys(username);
	}
	public void txt_password(String password) {
		txt_userpwd.sendKeys(password);
	}
	public void btn_LoginBtn() {
		btn_LoginBtn.click();
		
		
	}
}




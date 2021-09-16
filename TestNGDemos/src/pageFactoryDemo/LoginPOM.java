package pageFactoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	WebDriver driver;
	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//*[@value='Log in']")
	WebElement loginbtn;
	
	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void sendemail(String eml)
	{
		email.sendKeys(eml);
	}
	public void sendpassword(String pd) 
	{
		password.sendKeys(pd);
	}
	public void clickLogin()
	{
		loginbtn.click();
	}
 
}

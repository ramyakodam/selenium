package pagefactorydemowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import pageFactoryDemo.LoginPOM;
import pageFactoryDemo.RegisterPagePOM;

public class VerifyRegister {
	@Test
	public void validateRegister()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		RegisterPagePOM registerPage = PageFactory.initElements(driver, RegisterPagePOM.class);
		registerPage.clickGender();
		registerPage.sendFirstName("kodam");
		registerPage.sendLastName("shanku");
		registerPage.sendEmail("kodamshanku661@gmail.com");
		registerPage.sendPassword("shanku");
		registerPage.sendConfirmPassword("shanku");
		registerPage.clickRegister();
		registerPage.clickLogOut();
		registerPage.clickLogIn();
		
		 
        LoginPOM loginPage=PageFactory.initElements(driver, LoginPOM.class);
        
        loginPage.sendemail("kodamshanku661@gmail.com");
        loginPage.sendpassword("shanku");
        loginPage.clickLogin();
        driver.close();
	}
}
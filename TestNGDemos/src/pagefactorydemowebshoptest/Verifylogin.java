package pagefactorydemowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactoryDemo.LoginPOM;

public class Verifylogin {
	@Test
	public void validateLogin()
	{

   	    System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        
        LoginPOM loginPage=PageFactory.initElements(driver, LoginPOM.class);
        
        loginPage.sendemail("kodamshanku66@gmail.com");
        loginPage.sendpassword("shanku");
        loginPage.clickLogin();
        driver.close();
			
		}
	
}
	
	
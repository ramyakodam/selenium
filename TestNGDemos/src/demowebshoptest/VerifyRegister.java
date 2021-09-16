package demowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactorydemo.LoginPagePOM;
import pagefactorydemo.RegisterPagePOM;
import pompackage.LoginPagePOM;
import pompackage.RegisterPagePOM;

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
		registerPage.sendFirstName("Datta");
		registerPage.sendLastName("Sai");
		registerPage.sendEmail("dattasai00.m@gmail.com");
		registerPage.sendPassword("Dattasai98");
		registerPage.sendConfirmPassword("Dattasai98");
		registerPage.clickRegister();
		registerPage.clickLogOut();
		registerPage.clickLogIn();
		
		LoginPagePOM loginPage = PageFactory.initElements(driver, LoginPagePOM.class);
		loginPage.sendEmail("dattasai00.m@gmail.com");
		loginPage.sendPassword("Dattasai98");
		loginPage.clickLogin();
		driver.close();
	}
}
package learntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependenciesDemo {
     WebDriver driver;
     @Test(description="Test case to open application")
     public void startapp()
     { 
          System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("http://demowebshop.tricentis.com/login");
          driver.manage().window().maximize();
          System.out.println("start application");
     }
     @Test(dependsOnMethods = "startapp")
     public void loginapp()
     {
    	 driver.findElement(By.id("Email")).sendKeys("kodamshanku66@gmail.com");
         driver.findElement(By.name("Password")).sendKeys("shanku");
         driver.findElement(By.xpath("//input[@value='Log in']")).click();
         System.out.println("sucessfully Login");
     }
     @Test(dependsOnMethods = "loginapp")
     public void signoff()
     {
    	 driver.findElement(By.linkText("Log out")).click();
    	 System.out.println("signoff successfully");
     }
     @Test(dependsOnMethods= "signoff",alwaysRun=true)
     public void closebrowser() {
    	 driver.close();
     }
     }
     
     



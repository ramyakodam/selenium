package learntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityDemo {
	
WebDriver driver;

     @Test
     public void startapp()
     {
    	 System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://demowebshop.tricentis.com/login");
         driver.manage().window().maximize();
         System.out.println("start application");
     }
      
         @test(priority=1)
         public void loginapp()
         
         {
         
             driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
             driver.findElement(By.name("Password")).sendKeys("rekhab");
             driver.findElement(By.xpath("//input[@value='Log in']")).click();
             System.out.println("sucessfully Login");
         }
         @Test(priority=2)
         
     
     

package webshopDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        driver.manage().window().maximize();
        
        List<WebElement> allinks=driver.findElements(By.tagName("a"));
        System.out.println("The number of links is"+ allinks.size());
        for(WebElement link:allinks) {
        	System.out.println(link.getText());
        }
	}

}

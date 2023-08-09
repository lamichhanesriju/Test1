package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest_4 {
 
	
  
  
		public WebDriver driver;
		
		@BeforeMethod
		
		public void setUp()
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
	  }
		
		
		@Test(priority = 0)
		
		public void login()//login is my first  method name 
		{
			driver.findElement(By.id("email")).sendKeys("kumud1608@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("kumud@987");
			driver.findElement(By.name("login")).click();
			
			String i= driver.getTitle();
			System.out.println("Title of login page :"+i);
		}
		
		@Test(priority = 1)
		
		public void verifyCreatepagetLink()//2nd method 
		{
			driver.findElement(By.linkText("Create a Page")).click();
			
			String j= driver.getTitle();
			System.out.println("Title of CreateAccountLink page :"+j);
		}
		
		@Test(priority=2)
		
		public void forgotAccount()//3rd meothod 
		{
			driver.findElement(By.linkText("Forgot password?")).click();
			String k= driver.getTitle();
			System.out.println("Title of forgotaccountlink :"+k);
  
  }
@AfterMethod
		
		public void closeAllWindow()
		{
			driver.quit();
		}
}

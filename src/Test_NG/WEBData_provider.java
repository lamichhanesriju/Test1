package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WEBData_provider {

  
  
	  @DataProvider(name = "Authentication")//dataprivder annotation to provide data

	  public static Object[][] credentials()

	 

	  {

	               

	                //creatign an object with two inputs userName and password 

	                return new Object[][] { {"mercury","mercury"},{"sai","hrishi"}};

	                //how may times we are repaeting the data combinations for username sand

	                //password the scruitp will run those many times

	                }

	                //above line returns dat to the the object             }                       

	                // Here we are calling the Data Provider object with its Name            

	             

	 

	                @Test(dataProvider = "Authentication")                        

	               

	                public void test(String sUsername, String sPassword) {        //test is my method after void          

	                            

	                               WebDriver Driver = new ChromeDriver();
	                               Driver.get("https://demo.guru99.com/test/newtours/");         

	                               // Argument passed will be used here as String Variable             

	                              

	                               Driver.findElement(By.name("userName")).sendKeys(sUsername);         

	                               Driver.findElement(By.name("password")).sendKeys(sPassword);           

	                               Driver.findElement(By.name("submit")).click();
	                               
	                               //if it correctly enter  with corrctdetails welcome page should open
	                               Assert.assertEquals(Driver.getTitle(), "Login: Mercury Tours");
	                               String i= Driver.getTitle();
	                               System.out.println("Title of login page :"+i);
	                               System.out.println("login sucess");
	            
  
  
  
  
  }
}


	                              

	                              

	                               

	                              

	                               
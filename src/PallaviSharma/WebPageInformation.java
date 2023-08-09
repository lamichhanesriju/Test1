package PallaviSharma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		driver.get("http://practice.bpbonline.com");
		System.out.println(driver.getTitle());
		if (driver.getPageSource().contains("wlcome to BPB PuBLICATIONS"))
		{
		System.out.println("page is loaded");
	}
          driver.manage().window().maximize();
          
          driver.navigate().to("https://www.selenium.dev");
          
          if(driver.getCurrentUrl().contains("selenium")){
        	  System.out.println("page is now changed to selenium website");  
        	  driver.close();
        	 
          }       }
}
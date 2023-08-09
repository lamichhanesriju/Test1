package PallaviSharma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
 
		driver.get ("http://practice.bpbonline.com/");
		driver.manage().window().maximize();
	
	 WebElement MyAccountlink = driver.findElement(By.linkText("My Account"));
	  MyAccountlink.click();
	  Thread.sleep(5000);
	  driver.close();
	}
	

}

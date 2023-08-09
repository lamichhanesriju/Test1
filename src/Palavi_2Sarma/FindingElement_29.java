package Palavi_2Sarma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElement_29 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
WebDriver driver = new ChromeDriver();
		
		driver.get("http://practice.bpbonline.com/");
		
		driver.manage().window().maximize();
		
		WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
		
		Thread.sleep(3000);
		
		myAccountLink.click();
		
		
	}

}

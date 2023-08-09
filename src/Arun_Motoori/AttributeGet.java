package Arun_Motoori;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		System.out.println("Hello Boss");
		
		 
		 String textonButton = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div[1]/div[2]/div[1]/div/form/table/tbody/tr/td[2]/input")).getAttribute("value");
	       
	       
	      driver.quit();
	      test
	      
	      
	       
	
	}

}

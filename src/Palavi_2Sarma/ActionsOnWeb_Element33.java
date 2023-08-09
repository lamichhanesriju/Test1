package Palavi_2Sarma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsOnWeb_Element33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://practice.bpbonline.com/");
		
		driver.manage().window().maximize();
		
		WebElement SearchField = driver.findElement(By.name("keywords"));
		
		SearchField.clear();
		 SearchField.sendKeys("mouse");
		 
		 WebElement quickFind = driver.findElement(By.xpath("//input[@title = 'Quick Find']"));
		 
		 quickFind.click();
		
	}

}

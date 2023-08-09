package Palavi_2Sarma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchElements_info34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://practice.bpbonline.com/");
		
		driver.manage().window().maximize();
		
		WebElement quickfind = driver.findElement(By.xpath("//input[@title = 'Qucik Find']"));
		
		System.out.println(quickfind.getAttribute("alt"));
		
		System.out.println(quickfind.getTagName());
		System.out.println(quickfind.getText());
		System.out.println(quickfind.getCssValue("Background-color)"));
		
		System.out.println(quickfind.getSize().height);
		System.out.println(quickfind.getRect().height);
		
		//driver.close();
		
		
		
		
	}

}

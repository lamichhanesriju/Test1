package Palavi_2Sarma;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingall_links30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://practice.bpbonline.com/");
		
		driver.manage().window().maximize();
		
		//List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		List<WebElement>allLinks = driver.findElements(By.xpath("//a"));
		
		   for (WebElement lnk:allLinks);
		   
		   //System.out.println(lnk.getText());
		   
		   //System.out.println(link.getText());
		
	}

	}

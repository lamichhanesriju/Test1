package Palavi_2Sarma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageInfo_If28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://practice.bpbonline.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()); 
		
		if(driver.getPageSource().contains("Welcome to BPB PUBLICATION"));
	
		System.out.println("page is loaded");
		
		
		driver.navigate().to("https://www.selenium.dev/");
		
		if (driver.getCurrentUrl().contains("selenium"));
		
		System.out.println("page is now change to selenium Website");
		
		
		
		
	}

}

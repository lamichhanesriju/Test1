package Palavi_2Sarma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://practice.bpbonline.com/");
		Thread.sleep(5000);
		driver.close();
		
	}

}

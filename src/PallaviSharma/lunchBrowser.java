package PallaviSharma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
		Driver.get("http://practice.bpbonline.com/");
		Thread.sleep(5000);
		Driver.close();
		
	}

}


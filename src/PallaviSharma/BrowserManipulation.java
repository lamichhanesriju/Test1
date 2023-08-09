package PallaviSharma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		
		driver.get ("http://practice.bpbonline.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev");
		driver.close();
	}

}

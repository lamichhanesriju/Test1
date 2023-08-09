package Arun_Motoori;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
         
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
		
	}

}

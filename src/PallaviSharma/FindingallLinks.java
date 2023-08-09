package PallaviSharma;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingallLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.bpbonline.com");
		driver.manage().window().maximize();
		List<WebElement>allLinks = driver.findElements (By.xpath("//a"));
		for (WebElement Ink :allLinks) {
			System.out.println(Ink.getText());
		}
		
	}

}


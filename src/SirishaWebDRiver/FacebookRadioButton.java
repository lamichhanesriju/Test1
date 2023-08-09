package SirishaWebDRiver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookRadioButton {
@Test
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
public void FBR(){//classname
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/");
			
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
	}}

		
		
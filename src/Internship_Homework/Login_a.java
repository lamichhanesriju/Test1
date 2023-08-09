package Internship_Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
	
		 //driver.findElement(By.name("srchword")).sendKeys("lic");
		 driver.findElement(By.className("msprite btn_srch")).click();
		 //driver.findElement(By.name("srchword")).click();
		 
		 
		 
		/* d.findElement(By.name("firstname")).sendKeys("Krinajal");
			d.findElement(By.name("lastname")).sendKeys("Lamichhane");
			d.findElement(By.name("reg_email__")).sendKeys("srijul@gmail.com");*/
	}
	

}

package SirishaWebDRiver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_login {
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
		
		WebDriver driver =new ChromeDriver();//d is the variable to be used in the whole script 
		//driver.get("http://wwww.google.com");
		driver.get("https://www.facebook.com/signup/");
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("Krinju");//text field
		
		//driver.findElement(By.id("u_0_b_4O")).sendKeys("Ranju");
				
				//sendkeys("Ranju");
				
		//driver.findElement(By.id("u_0_d_AY")).sendKeys("Sriju");
		//driver.findElement(By.className("inputtext")).sendKeys("Bandu");
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Usu");

		
		
		
	}

}

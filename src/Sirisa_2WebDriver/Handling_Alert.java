package Sirisa_2WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
            driver.get("https://ksrtc.in/oprs-web/");
            driver.findElement(By.className("btn-booking")).click();
           
            Alert Al =  driver.switchTo().alert();
            System.out.println(Al.getText());
            Al.accept();
            Al.dismiss();
            
		/*WebDriver d = new ChromeDriver();
		d.get("https://ksrtc.in/");
		d.findElement(By.id("corover-close-btn")).click();
		d.findElement(By.className("btn-primary")).click();
		Thread.sleep(1000);
		Alert AL=d.switchTo().alert();
		System.out.println(AL.getText());
		AL.accept();
		//AL.dismiss();*/
		
	}

}

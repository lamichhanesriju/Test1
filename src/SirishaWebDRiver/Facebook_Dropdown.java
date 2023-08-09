package SirishaWebDRiver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//WebDriver p1=new FireFoxDriver();
				//go to selenium hq.org ->download->browser -firefox and downlaod the .exe fiel
				
		WebDriver driver =new ChromeDriver();//to open the chrome browsert
		
		driver.get("https://www.facebook.com/signup");//to open any sepecific url
				
				
				//Select M =new Select (driver.findElement(By.className("className")));
				//M.selectByVisibleText("Jan");
				
				Select B  =new Select (driver.findElement(By.name("birthday_day")));
				B.selectByVisibleText("10");
				
				Select Y =new Select (driver.findElement(By.name("birthday_year")));
				Y.selectByVisibleText("1990");
			}

		
	}



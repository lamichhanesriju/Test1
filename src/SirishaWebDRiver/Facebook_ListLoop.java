package SirishaWebDRiver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_ListLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver p=new ChromeDriver();
		p.get("https://www.facebook.com/signup");
		
		
		Select m=new Select (p.findElement(By.name("birthday_month")));
				
				
		m.selectByVisibleText("Aug");
		
		Select d=new Select (p.findElement(By.name("birthday_day")));
		
		d.selectByVisibleText("10");
		
		Select y=new Select (p.findElement(By.name("birthday_year")));
		
		y.selectByVisibleText("1995");
	}
		
	}



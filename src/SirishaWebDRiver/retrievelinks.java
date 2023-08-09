package SirishaWebDRiver;

//import java.awt.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class retrievelinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver d = new ChromeDriver();//open the chrome driver
		 d.get("https://www.google.com");
			  
		  List<WebElement>lk =  d.findElements(By.tagName("a"));
		  System.out.println("Total no of links are:"+lk.size());
		  
		  
		  for(WebElement ele:lk)//for each loop
		  {
		   System.out.println(ele.getAttribute("href"));
		  System.out.println(ele.getText());
	}

}}

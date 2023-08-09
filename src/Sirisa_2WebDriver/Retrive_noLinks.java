package Sirisa_2WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retrive_noLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver S = new ChromeDriver();
		S.get("https://www.cnn.com/");
		
		List< WebElement> kl = S.findElements(By.tagName("a"));
		System.out.println("Total no of links are ; " +kl.size());
		
		for (WebElement ele : kl);
		
		{ 
			System.out.println(ele.getAtribut("href"));
			System.out.println(ele.getText());
		
		/*for(WebElement ele:kl)//for each loop
		  {
		   System.out.println(ele.getAttribute("href"));
		  System.out.println(ele.getText());*/
	}
	}
}	
	


package SirishaWebDRiver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retrieveimages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver d = new ChromeDriver();//open the chrome driver
		 d.get("https://www.google.com");
			  
		  List<WebElement>lk =  d.findElements(By.tagName("img"));
		  System.out.println("Total no of imagesare:"+lk.size());
		  
		  
		  for(WebElement ele:lk)//for each loop
		  {
		   System.out.println(ele.getAttribute("src"));//link of my image is stored in src file 
		  System.out.println(ele.getText());
	}


	}

}

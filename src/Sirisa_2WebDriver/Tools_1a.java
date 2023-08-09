package Sirisa_2WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools_1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/social-icon.html");
		String Ett = "tub";
		WebElement T= d.findElement(By.className("fa-github"));
				//className("fa-github"));
		
		String Att = T.getAttribute("Title");
		System.out.println ("AcutualTitle of the tool tip"+ Att);
		if (Att.equals(Ett)){
			System.out.println ("test case pass");
			
		} else System.out.println ("test case fail");


	}

}

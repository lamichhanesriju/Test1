package Sirisa_2WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_Command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			 
				 WebDriver A = new ChromeDriver();
				    A.get("https://www.cnn.com/");
				    A.get("https://www.amazon.com/");
				    A.navigate().back();
				    A.navigate().forward();
				    A.navigate().refresh();
				   String B = A.getCurrentUrl();
				   String C= A.getTitle();
				   
				   
				   
				 /* WebDriver d=new ChromeDriver();
			  d.get("http://amazon.com");
			  d.navigate().to("http://google.com");
			  d.get("http://demo.guru99.com");
			  d.navigate().back();
			  d.navigate().forward();
			  //Refresh command
			  d.navigate().refresh();
			  //get command
			  String c=d.getCurrentUrl();
			  String t=d.getTitle();
			  System.out.println("current URL : "+c);
			  System.out.println("current title : "+t);
			  //d.close();
			  d.quit();*/


		
	}

}

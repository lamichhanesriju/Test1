package SirishaWebDRiver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");//this will make the browser move down
		
		
		//Thread.sleep(10000);
		//js.executeScript("window.scrollBy(0,-1000)");//this will make the bar move up
	}
	

}

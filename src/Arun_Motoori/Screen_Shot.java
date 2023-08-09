package Arun_Motoori;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		

		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();

		    driver.get("https://www.amazon.com/");
		    
		   File SrcScreenShort = driver.findElement(By.name("site-search")).getScreenshotAs(OutputType.FILE);
		    
		    FileHandler.copy(SrcScreenShort,new File(System.getProperty("user.dir")+"\\Screenshot.png"));
	}

}

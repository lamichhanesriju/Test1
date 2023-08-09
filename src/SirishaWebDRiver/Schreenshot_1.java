package SirishaWebDRiver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Schreenshot_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 //WebDriver.D = new ChromeDriver ();
		 //d.gets ("https://www.google.com/")
		//File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		//Files.copy(scrFile, new File("C:\\screenshot.\\1.jpg"));
	
	
	WebDriver D = new ChromeDriver();
	//WebDriver d = new ChromeDriver();
	
	D.get ("https://www.google.com/");
	File ScrFile = (( TakesScreenshot)D).getScreenshotAs(OutputType.FILE);
	Files.copy (ScrFile, new File ("C:\\Screeshot.\\1.jpj"));
	
	
	
	}

}

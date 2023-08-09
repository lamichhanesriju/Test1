package Sirisa_2WebDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_1a {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		WebDriver D = new ChromeDriver();
		//WebDriver d = new ChromeDriver();
		
		D.get ("https://www.cnn.com/");
		File ScrFile = (( TakesScreenshot)D).getScreenshotAs(OutputType.FILE);
		Files.copy (ScrFile, new File ("C:\\Users\\lamic\\OneDrive\\Desktop\\Sc\\2.jpg"));

	}
}


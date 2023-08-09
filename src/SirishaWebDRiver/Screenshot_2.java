package SirishaWebDRiver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Convert web driver object to TakeScreenshot
		//TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		//File DestFile=new File(fileWithPath);
		//Copy file at destination
		//FileUtils.copyFile(SrcFile, DestFile);

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get ("http://jqueryui.com/droppable");
		Thread.sleep(10000);
		JavascriptExecutor js= (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,1300)");
		File sc=((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		try {
		Files.copy(sc, new File("C:\\Users\\hrish\\OneDrive\\Documents\\HS\\1.png"));
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,-1300)");


		}

		}

		
		
	}

}

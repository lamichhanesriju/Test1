package SirishaWebDRiver;

public class Shreenshot_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("C:\\screenshot.\\1.jpg"));

		Malladi Sirisha 9:18 AM
		WebDriver driver=newChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://jqueryui.com/droppable/");
				Thread.sleep(10000);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,1000)");//this will make the browser move down
				//Thread.sleep(10000);
				//js.executeScript("window.scrollBy(0,-1000)");//this will make the bar move up
	}

}

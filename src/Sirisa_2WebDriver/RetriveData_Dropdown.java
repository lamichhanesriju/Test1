package Sirisa_2WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveData_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/signup");
		   WebElement m = driver.findElement(By.id("month"));
		   m.findElements(By.tagName("option"));
		   List<WebElement> month = m.findElements(By.tagName("option"));
		
		   for (int i = 0; i<month.size();i ++)
		    System.out.println(month.get(i).getText());
		   
		   
		   
		   
		/*WebDriver d=newFirefoxDriver();
		driver.manage().window().maximize();
		d.get(&quot;https://www.facebook.com/signup&quot;);
		WebElement m=d.findElement(By.id(&quot;month&quot;));

		//identify an element of a dropdown
		//my drop down field is month

		List&lt;WebElement&gt; month =m.findElements(By.tagName(&quot;option&quot;));
		for(int i=0;i&lt;month.size();i++)
		{
		System.out.println(month.get(i).getText());
		}

		//or
		/ Loop through all the options in the dropdown list and print their text
		for (WebElement option : m.getOptions()) */
		
	}}



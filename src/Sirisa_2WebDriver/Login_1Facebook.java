package Sirisa_2WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_1Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/signup/");
		d.findElement(By.name("firstname")).sendKeys("Krinajal");
		d.findElement(By.name("lastname")).sendKeys("Lamichhane");
		d.findElement(By.name("reg_email__")).sendKeys("srijul@gmail.com");
		
		/*WebDriver d =new ChromeDriver(
		d.get(&quot;https://www.facebook.com/signup&quot;);
		d.findElement(By.name(&quot;firstname&quot;)).sendKeys(&quot;sirisha&quot;);
		d.findElement(By.name(&quot;lastname&quot;)).sendKeys(&quot;G&quot;);
		//send keys command is to send data to text fields
		//find element is used to find any element on the webapplication
		//name is locator to identify a particular elemnt o na webpage
		//name ,classname ,xpath ,id etc
		Select dy=new Select(d.findElement(By.id(&quot;day&quot;)));
		dy.selectByVisibleText(&quot;12&quot;); */
		}
	}



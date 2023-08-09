package Sirisa_2WebDriver;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Table_Retive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 
		WebElement element=driver.findElement(By.id("allpage_links"));
		////*[@id="allpage_links"]/tbody/tr[2]/td[2]/a[8]//the element is located on the row 2 column2 which is the 8 th element on hte table 
		List<WebElement> rc=element.findElements(By.xpath("//*[@id='allpage_links']/tbody/tr"));
		List<WebElement> cc=element.findElements(By.xpath("//*[@id='allpage_links']/tbody/tr/td"));
		List<WebElement> elements=element.findElements(By.xpath("//*[@id='allpage_links']/tbody/tr/td/a"));
		
		System.out.println("Number of rows in the table:" + rc.size());
		System.out.println("Number of columns in the table:" + cc.size());
		
		System.out.println("Number of columns in the table:" + cc.size());
		
		
		//to get data from the webtable 
		
		
		int i_RowNum=1;

		for(WebElement rowElement:rc)
		{
		      List<WebElement>cl=rowElement.findElements(By.xpath("td"));
		
int i_ColNum=1;
		for(WebElement colElement:cc)
		      {
			
			
		System.out.println("Row "+i_RowNum+" Column "+i_ColNum+" Data "+colElement.getText());
	
		i_ColNum=i_ColNum+1;//once all the data is picked fro mthe specif column it gets incerase 
		       }
		i_RowNum=i_RowNum+1;//this will run once a specif row is completed it will iteratte or increase the row to the next row

//row1 column 1 data ....
		//roq col2 data ...
		//it will iterate row from 1 to 2 
		//row 2 col1 data ....
		//row 2 col2 data ....
		
	
}
		
		
	}



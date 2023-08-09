package Test_NG;

import org.testng.annotations.Test;

public class NewTest_ExcelData {
  @Test
  public void f() {
 
  
	  /intialising data for the commands

	  WebDriver driver;//this will help to not write all time webdriver driver
	  Workbook wb;//imoprt commands are fetching from the dowmnloaded jxl jar
	  Sheet sh1;//excel sheet
	  int numrow;//for loop


	  @BeforeMethod
	  public void Setup()

	  {
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  }


	  @Test(dataProvider = "testdata")//passign data from data provider
	  public void ExcelData (String uname, String password1)//main method

	  {


	  driver.findElement(By.name("userName")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(password1);
	  driver.findElement(By.name("Submit")).click();
	  }


	             //The below one is created first and then we pass this testdata into the @ Test on top of the script

	  @DataProvider(name = "testdata")//using this annotation provide data from excel to script
	  public Object[][] TestDataFeed() {

	  try {

	  // load workbook
	  wb = Workbook.getWorkbook(new File("C:\\Users\\vamsi\\OneDrive\\Desktop\\TestData.xls"));//create and excel sheet with data and save it as .xls extension


	  // load sheet in my case I am referring to first sheet only
	  sh1 = wb.getSheet(0);

	  // get number of rows so that we can run loop based on this

	           numrow = sh1.getRows();//to get the first row and loop runs for next rows
	  System.out.println(numrow);//to print no of rows in the excel

	           numcol=sh1.getColumns()
	          System.out.println(numcol);


	  } catch (Exception e)
	  {
	  e.printStackTrace();
	  }

	  // Create 2 D array and pass row and columns
	  Object[][] NTdata = new Object[numrow][numcol];

	  // This will run a loop and each iteration it will fetch new row

	          for (int i = 0; i < numrow; i++) {

	  // Fetch first row username

	  NTdata[i][0] = sh1.getCell(0, i).getContents();

	  // Fetch first row password

	  NTdata[i][1] = sh1.getCell(1, i).getContents();

	  }

	  // Return 2d array object so that test script can use the same
	  return NTdata;
	  }

	  //@After Method
	  //public void QuitTC() {

	  // close browser after execution
	  //driver.quit();
	  }
  }
}

package SecurityCheck;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunLoadJob extends WebUtil{
	GlobalVariables gv=new GlobalVariables();

//-----------------------------------------------------------------------------------------------------------------------------------------------------  
	@Parameters({ "URL", "UserName", "Password" })
	
	@Test
 public void Login(String url, String UserName, String Password) 
{
	  System.out.println("---------------------------------------------------------------------");
	  WebUtil WebUtil=new WebUtil();
	  WebUtil.OpenWithChrome(url);
	  driver.manage().window().maximize();
	  System.out.println(":: Application URL:" +url);
	  boolean username= driver.findElement(By.id("ppm_login_username")).isDisplayed();
  	  if (username==true)
  	  	{
	  	  driver.findElement(By.id("ppm_login_username")).sendKeys(UserName);	  	  
	  	  System.out.println(":: User Name ::" +UserName);
	  	  Assert.assertEquals(username, true);
  	  	}
	  	else {System.out.println(":: User Name filed not displayed::");}	  

  //Login Page --> Login Password
  boolean password=driver.findElement(By.id("ppm_login_password")).isDisplayed();
  	if (password==true)
  	  {	  			
  		driver.findElement(By.id("ppm_login_password")).sendKeys(Password);
  		System.out.println(":: User Password ::" +Password);
 
  		Assert.assertEquals(password, true);	  			  		
  	  }
  	else {System.out.println(":: User Name filed not displayed::");}	  		  	

 boolean LoginButton=driver.findElement(By.id("ppm_login_button")).isDisplayed();
 if (LoginButton==true)
 	{
	 	driver.findElement(By.id("ppm_login_button")).click(); 
 	}
  	
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------

 @Test
 public void RunLoadJobs() throws InterruptedException{
		
		Thread.sleep(2000);
		  WebElement menuElement=driver.findElement(By.xpath("//*[text()='Administration']"));
			String strJs = "var element = arguments[0];"
				+ "var mouseEventObj = document.createEvent('MouseEvents');"
				+ "mouseEventObj.initEvent( 'mouseover', true, true );"
				+ "element.dispatchEvent(mouseEventObj);";
			JavascriptExecutor js =  (JavascriptExecutor) driver;
			Thread.sleep(2000);
			js.executeScript(strJs, menuElement); 
			js.executeScript(strJs, menuElement);
			
			Thread.sleep(2000);
			 driver.findElement(By.xpath("(//a[@title='Jobs'])[2]")).click();			 			 			 
			 Thread.sleep(2000);
			 driver.findElement(By.name("jobDefName")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.name("jobDefName")).sendKeys("Load*");
	 		 		 
			 Thread.sleep(2000);
			 driver.findElement(By.name("filter")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[@title='Select All'])[1]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[contains(@title, 'Activate')]")).click(); 
			 

//-----------------------------------------------------------------------------------------------------------------------------------------------------

	System.out.println(":: Run  Load Job Started::");
 	 Thread.sleep(2000);
 	  WebElement menuElement1=driver.findElement(By.xpath("//*[text()='Home']"));
 		String strJs1 = "var element = arguments[0];"
 			+ "var mouseEventObj = document.createEvent('MouseEvents');"
 			+ "mouseEventObj.initEvent( 'mouseover', true, true );"
 			+ "element.dispatchEvent(mouseEventObj);";
 		JavascriptExecutor js1 =  (JavascriptExecutor) driver;
 		Thread.sleep(2000);
 		js1.executeScript(strJs1, menuElement1); 
 		js1.executeScript(strJs1, menuElement1);
 		
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("(//a[@title='Jobs'])[1]")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.name("job_name")).sendKeys("Load*");
 		Thread.sleep(2000);
 		driver.findElement(By.name("search")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title='Load Data Warehouse']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@name,'job_name')]")).clear();
		driver.findElement(By.xpath("//*[contains(@name,'job_name')]")).sendKeys("ALoadDW_AutoTest");
		Thread.sleep(2000);
		driver.findElement(By.name("FULL_RELOAD")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		System.out.println("::Load Job Started::");		
		Thread.sleep(2000);
 		driver.findElement(By.xpath("(//*[text()='Jobs'])[3]")).click();
 		Thread.sleep(2000);
 		
 		WebElement menuElement3=driver.findElement(By.xpath("(//*[text()='Jobs'])[3]"));
 		String strJs3 = "var element = arguments[0];"
 			+ "var mouseEventObj = document.createEvent('MouseEvents');"
 			+ "mouseEventObj.initEvent( 'mouseover', true, true );"
 			+ "element.dispatchEvent(mouseEventObj);";
 		JavascriptExecutor js3 =  (JavascriptExecutor) driver;
 		Thread.sleep(2000);
 		js3.executeScript(strJs3, menuElement3); 
 		js3.executeScript(strJs3, menuElement3);
 		Thread.sleep(1000);
 		driver.findElement(By.xpath("//*[@title='Available Jobs']")).click(); 
 		Thread.sleep(2000);
 		driver.findElement(By.name("job_name")).sendKeys("Load*");
 		Thread.sleep(2000);
 		driver.findElement(By.name("search")).click();
		Thread.sleep(2000);
 		Thread.sleep(2000);
 		driver.findElement(By.name("job_name")).clear();
 		Thread.sleep(1000);
 		driver.findElement(By.name("job_name")).sendKeys("Load Data Warehouse Access Rights");
 		Thread.sleep(2000);
 		driver.findElement(By.name("search")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title='Load Data Warehouse Access Rights']")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@name,'job_name')]")).clear();
		driver.findElement(By.xpath("//*[contains(@name,'job_name')]")).sendKeys("ALoadDWAccessRights_AutoTest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("job_name")).sendKeys("*ALoadDW*"); 		  
		Thread.sleep(2000);
		driver.findElement(By.name("search")).click();
		Thread.sleep(2000);
		
		int ll= driver.findElements(By.xpath("//div[@class='ppm_gridcontent']//table[@class='ppm_grid']//tbody//tr")).size();
		int prgCnt= driver.findElements(By.xpath("//div[@class='ppm_gridcontent']//table[@class='ppm_grid']//tbody//tr//td[text()='Processing']")).size();
		System.out.println("PageCount::" +prgCnt);
		
		int cnt=0;
		while (prgCnt!=0){
			 prgCnt= driver.findElements(By.xpath("//div[@class='ppm_gridcontent']//table[@class='ppm_grid']//tbody//tr//td[text()='Processing']")).size();
			 driver.findElement(By.xpath("//*[text()='Filter']")).click();
			 Thread.sleep(10000);
			 System.out.println("LoadJobInprogress...");
			  if (cnt==360){
				 break;
			 }  cnt++;
			 			 
		}
		System.out.println("::Load Job ran Completed::");
	}
//-----------------------------------------------------------------------------------------------------------------------------------------------------
 
 @Test
 @Parameters({"dbUrl", "dbusername", "dbpassword", "dbquery", "OutPutRes" })

  public void dbconnect(String dbUrl, String dbusername,  String dbpassword, String dbquery, String OutPutRes) throws ClassNotFoundException, SQLException, Exception{
		System.out.println(":: DB connection started" +OutPutRes);
		File exlFile = new File("c:/"+OutPutRes+".xls");
	    WritableWorkbook writableWorkbook = Workbook.createWorkbook(exlFile);
	    WritableSheet writableSheet = writableWorkbook.createSheet("Sheet1", 0);
     Class.forName("oracle.jdbc.driver.OracleDriver");
     //Create Connection to DB       
     Connection con = DriverManager.getConnection(dbUrl,dbusername,dbpassword);

     //Create Statement Object       
    Statement stmt = con.createStatement();                  

     // Execute the SQL Query. Store results in ResultSet        
     ResultSet rs= stmt.executeQuery(dbquery);                         
     // While Loop to iterate through all data and print results     
     while (rs.next()){
    	 
    	 	System.out.println(":: DB result set");
			System.out.println("*******************************************************************");
                 
				 String record1 = rs.getString(1);                                        
                 String record2 = rs.getString(2);   
                 String record3 = rs.getString(3);                                        
                 String record4 = rs.getString(4);   
                 System. out.println("Record 1:" +record1+"  " +"Record 2:"+record2 +" " +"Record 3:"+record3 +" " +"Record 4:"+record4);
                 
                 Label label = new Label(0, 0, record1);
                 Label label2 = new Label(0, 1, record2);
                 Label label3 = new Label(0, 2, record3);
                 Label label4 = new Label(0, 3, record4);
                 
                 writableSheet.addCell(label);
                 writableSheet.addCell(label2);
                 
                 //Write and close the workbook
                 writableWorkbook.write();
                 writableWorkbook.close();
                 
         }       
      // closing DB Connection       
     con.close(); 
 }
 
//-----------------------------------------------------------------------------------------------------------------------------------------------------
	 
}

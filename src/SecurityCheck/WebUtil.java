package SecurityCheck;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class WebUtil {
     static WebDriver driver;
	 GlobalVariables gv=new GlobalVariables();
	 static final ExtentReports extent = ExtentReports.get(WebUtil.class); 
	 
	 @Test 
	public void OpenWithChrome(String url)
	 {		 
		extent.init("c:\\report.html", true);
		extent.config().useExtentFooter(false);
		System.setProperty("webdriver.chrome.driver", gv.ChromeDriver);	
		driver=new ChromeDriver();		
        //driver.get(gv.URL);
		driver.get(url);

	
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.MINUTES);
	} 

	public void OpenWithFireFox(String url) throws InterruptedException
	{		
		driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.MINUTES);		
	}
	
	public void OpenWithIE(String url) throws InterruptedException
	{		
		driver=new InternetExplorerDriver();
		Thread.sleep(2000);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.MINUTES);		
	}
	 public void Login(String url, String UserName, String Password) throws InterruptedException 
	 {
	 	  System.out.println("---------------------------------------------------------------------");
	 	  WebUtil WebUtil=new WebUtil();
	 	  WebUtil.OpenWithChrome(url);
	 	  	//WebUtil.OpenWithFireFox(url);
	 	  	//WebUtil.OpenWithIE(url);
	 	  //driver.manage().window().maximize();
			Dimension dd = new Dimension(360,592);
	        driver.manage().window().setSize(dd);
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
	 	 	Thread.sleep(2000);
	  	}
	   	
	 }
	 
	  
	 public void XSSVulnerabilityPatterns(String TestScenerio, String ScriptFunc, String URL, String UserName, String Password) throws InterruptedException, IOException{
		Login(URL, UserName, Password);
		 System.out.println("Scenerio to Test ::"+TestScenerio +" :: " +ScriptFunc);
		    
		  String sURL=URL+"/niku/nu#action:nmc.usersFilter&uitk.navigation.parent.location=Workspace&uitk.navigation.last.workspace.action=nmc.usersFilter&lastName="+ScriptFunc;
		  System.out.println("Function Patterns ::"+sURL);
		  driver.get(sURL);
		  Thread.sleep(3000);  
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		  FileUtils.copyFile(scrFile, new File("c:\\tmp\\" +TestScenerio +".png"));
		  Thread.sleep(1000);
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  boolean exists1=driver.findElements(By.xpath("//*[text()='[en - Unable to process request - Server error]']")).size() >0;
		  System.out.println(exists1);
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	try{
		  if (exists1==true) { 
			  System.out.println("Inside");
			  String TestOutPut=driver.findElement(By.xpath("//*[text()='[en - Unable to process request - Server error]']")).getText();
			  System.out.println("TestOutPut for the given Pattern ::"+ TestOutPut );
			  	  	  String TestOutPut1="[en - Unable to process request - Server error]";
			  	  	  
				  	  if (TestOutPut.equals(TestOutPut1)){
				  		  System.out.println(sURL +" -- Pattern Failed to injects");
				  		  Assert.assertEquals(TestOutPut1, TestOutPut);
				  	  	} else {
				  	  		
				  	  	//Assert.
				  	  System.out.println(sURL +" -- Pattern Passed to injection");
				  	  	}
		  
		}


	}catch (NoSuchElementException e){

	}
	  
			  Thread.sleep(2000);
			  driver.close();
		  	 
	  }
	 
	 
}
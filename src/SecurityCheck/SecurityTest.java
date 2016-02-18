package SecurityCheck;

import java.io.IOException;

public class SecurityTest extends WebUtil {
	static SecurityTestData td=new SecurityTestData();
	GlobalVariables gv=new GlobalVariables();
	SecurityTestData TestData=new SecurityTestData();
	static WebUtil WebUtil=new WebUtil();
	

	public  static void main(String args[]) throws InterruptedException, IOException{
		try{
		WebUtil.XSSVulnerabilityPatterns(SecurityTestData.XSSLocator_01, SecurityTestData.Value_01, td.AppUrl, td.UserName, td.Password);
		WebUtil.XSSVulnerabilityPatterns(SecurityTestData.XSSLocator_01, SecurityTestData.Value_01, td.AppUrl, td.UserName, td.Password);
		WebUtil.XSSVulnerabilityPatterns(SecurityTestData.XSSLocator_55, SecurityTestData.Value_55, td.AppUrl, td.UserName, td.Password);
		WebUtil.XSSVulnerabilityPatterns(SecurityTestData.XSSLocator_56, SecurityTestData.Value_56, td.AppUrl, td.UserName, td.Password);
		}catch(Exception e){System.out.println(e);}  
	}
	
	
	
	/*
 // @Parameters({ "TestScenerio", "ScriptFunc", "URL", "UserName",  "Password"})
  
  //@Test
  public void US3674_XSSLocators(String TestScenerio, String ScriptFunc, String URL, String UserName, String Password) throws InterruptedException, IOException {
	  WebUtil.Login(URL, UserName, Password);
	  
	  //http://dubve01-e7440/niku/nu#action:nmc.usersFilter&uitk.navigation.parent.location=Workspace&uitk.navigation.last.workspace.action=nmc.usersFilter&lastName=Adams&superSecretTokenKey=superSecretTokenValue
	  System.out.println("Scenerio to Test ::"+TestScenerio +" :: " +ScriptFunc);
	  //String sURL=URL+"/niku/nu#action:"+ScriptFunc;
	    
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
			  	  	} else {
			  	  	 System.out.println(sURL +" -- Pattern Passed to injection");
			  	  	}
	  
	}


}catch (NoSuchElementException e){

}
  
		  Thread.sleep(2000);
		  driver.close();
	  	 
  }
  
  */
}

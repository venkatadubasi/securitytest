package SecurityCheck;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EnvSettings extends WebUtil{
	
@Parameters({ "URL", "UserName", "Password" })
  @Test
  
  public void EnvSet(String url, String UserName, String Password) throws Exception {
	File exlFile = new File("c:/write_test.xls");
    WritableWorkbook writableWorkbook = Workbook.createWorkbook(exlFile);
    WritableSheet writableSheet = writableWorkbook.createSheet("Sheet1", 0);
    //Add the created Cells to the sheet
    
    Label label = new Label(0, 0, "Label (String)");
    Label label2 = new Label(0, 1, "Label (String)");
    
    writableSheet.addCell(label);
    writableSheet.addCell(label2);
    
    //Write and close the workbook
    writableWorkbook.write();
    writableWorkbook.close();

}

 
  }



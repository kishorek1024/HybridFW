package com.bofa;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	// Creating Global Variables,Objects,References
	public WebDriver driver;
	public FileInputStream f;
	public Workbook wb;
	public Sheet s;
	
    // Method Name  : launchApp
	// Description  : To Launch Application
	// Author       : Kishore Kumar
	// Date Created : 08072019
	// Reviewed By	: Shiva
	// Parameters   : String url, String sspath
	//*********************************************************************
	public void launchApp(String url, String sspath) throws Exception{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(sspath));}
	//**********************************************************************
	// Method Name  : closeApp
	// Description  : To Close Application
	// Author       : Kishore Kumar
	// Date Created : 08082019
	// Reviewed By	: Shiva
	// Parameters   : NA
	//*********************************************************************
	public void closeApp(){
		driver.close();	}
	//********************************************************************
	public void excel_Con(String excel_path, String sname) throws Exception {
		f=new FileInputStream(excel_path);
		wb=Workbook.getWorkbook(f);
		s=wb.getSheet(sname);	}
	//*********************************************************************
	public void element_Present(WebElement element, boolean exp, String sspath) throws Exception {
		boolean a=element.isDisplayed();
		if(a==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//**********************************************************************
	public void elements_Count(String loc, int exp, String sspath) throws Exception {
		List<WebElement> elements=driver.findElements(By.tagName(loc));
		if(elements.size()==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//***********************************************************************
	public void titleStarts(String exptext, boolean exp){
		String title=driver.getTitle();
		if(title.startsWith(exptext)==exp)
		System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//**********************************************************************************************
	public void urlContains(String expvalue, boolean exp) {
		String url=driver.getCurrentUrl();
		if(url.contains(expvalue)==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//***************************************************************************
	public void subelements(WebElement mainelement, String tagname, int exp, String sspath) throws Exception {
		List<WebElement> values=mainelement.findElements(By.tagName(tagname));
		if(values.size()==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}	
		
	}
	
	
}

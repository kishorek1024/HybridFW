package com.kishore;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bofa.Methods;
import com.bofa.PO_HomePage;
import com.bofa.PO_ProfessionalPage;

public class Module1_Tests {
	public Methods m;
	// Test Name        : TC01
	// Test Case Name   : TC01
	// Module Name      : Mod1
	// Application Name : Registration
	// Project Name     : Details
	// Author           : Kishore Kumar
	// Date             : 08092019
	// Reviewed By      : Shiva
	//****************************************************************************
	public void TC01() throws Exception {
		
		// Importing Methods Class
		m=new Methods();
		
		// Import Excel_Con method
		m.excel_Con("C:\\Users\\DELL\\Desktop\\Framework\\Test Data\\Kishore\\Module1\\tc01.xls", "Sheet1");
		
		// Launching Application
		m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\DELL\\Desktop\\Framework\\Test Results\\Kishore\\Module1\\TC01\\launchApp.png");
		
		// Importing PageObjects for HomePage
		PO_HomePage home=PageFactory.initElements(m.driver, PO_HomePage.class);
		
		// Verifying Elements available or not
		m.element_Present(home.PO_HomePage_IAMFresher, true, "C:\\Users\\DELL\\Desktop\\Framework\\Test Results\\Kishore\\Module1\\TC01\\IAMFresher.png");
		m.element_Present(home.PO_HomePage_IAMExperienced, true, "C:\\Users\\DELL\\Desktop\\Framework\\Test Results\\Kishore\\Module1\\TC01\\IAMExp.png");
		
		// Verifying Title starts with N
		m.titleStarts("n", true);
		
		// Clicking On I am Fresher Button
		home.PO_HomePage_IAMFresher.click();
		
		// Applying WebDriverWait
		WebDriverWait ww=new WebDriverWait(m.driver, 30);
		
		PO_ProfessionalPage prof=PageFactory.initElements(m.driver, PO_ProfessionalPage.class);
		
		// Waiting for Page to Load
		ww.until(ExpectedConditions.visibilityOf(prof.PO_ProfessionalPage_Name));
		
		// Verifying URL contains basedetails
		m.urlContains("basicdetails", true);
		
		// Counting Number of Values in dropdown
		//m.subelements(prof.PO_ProfessionalPage_Name, "option", 20, sspath);
		
		// Entering Name and Employee ID
		prof.PO_ProfessionalPage_Name.sendKeys(m.s.getCell(0, 1).getContents());
		prof.PO_ProfessionalPage_Email.sendKeys(m.s.getCell(0, 2).getContents());
		
		m.closeApp();	}
	//*****************************************************************************************
 
	public void TC02() throws Exception {
		
	}
	
}

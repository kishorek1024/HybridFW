package com.bofa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// PO Name : PO_HomePage
// Module  : Admin Module
// Application : Naukri
// Author      : Kishore Kumar
// Date Created: 08082019
//*********************************************************************
public class PO_HomePage {
	
	public @FindBy(xpath="/html/body/div/form/div[1]/div/button") 
	WebElement PO_HomePage_IAMFresher;
	public @FindBy(xpath="/html/body/div/form/div[2]/div/button")
	WebElement PO_HomePage_IAMExperienced;
	
	

}

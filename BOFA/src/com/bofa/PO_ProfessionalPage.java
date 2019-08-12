package com.bofa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_ProfessionalPage {
	
	public @FindBy(xpath="//*[@id='fname']") WebElement PO_ProfessionalPage_Name;
	public @FindBy(xpath="//*[@id='email']") WebElement PO_ProfessionalPage_Email;
	public @FindBy(xpath="//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input") WebElement PO_ProfessionalPage_Years;
	public @FindBy(xpath="//*[@id='basicDetailForm']/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input") WebElement PO_ProfessionalPage_CurrentLocation;

}

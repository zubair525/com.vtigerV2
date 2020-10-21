package com.vtigerV2.pomrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPagePom {
	@FindBy(xpath="//img[@alt='Create Contact...']")
	private WebElement createContact;
	
	@FindBy(xpath="//img[@alt='Search in Contacts...']")
	private WebElement Search;
}

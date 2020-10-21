package com.vtigerV2.pomrepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtigerV2.genericLib.WebDriverUtility;

public class HomePagePom extends WebDriverUtility {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement Organizations;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement Contacts;
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement Products;
	
	@FindBy(xpath="//img[contains(@src,'user.PNG')]")
	private WebElement profile;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logout;
	
	public void clickOnLogout() {
		moveToElement(driver, profile);
		logout.click();
	}
	public HomePagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getOrganizations() {
		return Organizations;
	}
	public WebElement getContacts() {
		return Contacts;
	}
	public WebElement getProducts() {
		return Products;
	}
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	
}

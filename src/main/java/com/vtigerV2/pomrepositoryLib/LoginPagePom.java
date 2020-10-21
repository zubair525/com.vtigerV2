package com.vtigerV2.pomrepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtigerV2.genericLib.JavaUtility;

import net.bytebuddy.matcher.ElementMatcher.Junction;

public class LoginPagePom  {
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public LoginPagePom(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	JavaUtility jutil=new JavaUtility();
	public void LoginToApp() throws Throwable {
		String UserName = jutil.getPropertyData("username");
		String Password = jutil.getPropertyData("password");
		username.sendKeys(UserName);
		password.sendKeys(Password);
		loginbtn.click();
		
	}
}

package com.vtigerV2.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtigerV2.pomrepositoryLib.HomePagePom;
import com.vtigerV2.pomrepositoryLib.LoginPagePom;

public class BaseClass {
public JavaUtility jutil=new JavaUtility();
public WebDriverUtility wutil=new WebDriverUtility();
public WebDriver driver;
@BeforeSuite
public void configBS() {
	System.out.println("Connect to DataBase");
	System.out.println("Configure Report");
}
@BeforeClass
public void configBC() throws Throwable {
	
	String Browser = jutil.getPropertyData("browser");
	if(Browser.equals("chrome"))	{
		driver=new ChromeDriver();
	}
	else if(Browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	else {
}
}
@BeforeMethod
public void configBM() throws Throwable
{
	String url = jutil.getPropertyData("URL");
	/*String USERNAME = jutil.getPropertyData("username");
	String PASSWORD = jutil.getPropertyData("password");*/
	driver.get(url);
	LoginPagePom login=new LoginPagePom(driver);
	/*login.LoginToApp(USERNAME, PASSWORD);*/
	login.LoginToApp();
}
@AfterMethod
public void configAM() {
	HomePagePom home=new HomePagePom(driver);
	home.clickOnLogout();
}
}


package com.vtigerV2.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This class contains webdriver specific methods
 * @author zubair
 *
 */
public class WebDriverUtility {
	/**
	 * This method is implicit wait which is used to wait till every elements get visible
	 * @param driver
	 * @param reqTime
	 */
	public void waitForAllElementsToLoad(WebDriver driver,int reqTime) {
		driver.manage().timeouts().implicitlyWait(reqTime, TimeUnit.SECONDS);
	}
	/**
	 * This is method is explicit wait which is used to wait till the particualr element is visible
	 * to perfom the required action.
	 * @param driver
	 * @param reqTime
	 * @param element
	 */
	public void waitTillVisiblityOfElement(WebDriver driver,int reqTime,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, reqTime);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method is customwait it will wait till the particular element is clickable.
	 * @param element
	 * @throws Throwable
	 */
	public void customWaitandClick(WebElement element) throws Throwable {
		int count=0;
		while(count<40) {
			try {
				element.click();
				break;
			}
			catch(Throwable e) {
				Thread.sleep(5000);
				count++;
			}
		}
	}
	/**
	 * This method is customwait it will wait till the particlar element is visible
	 * @param element
	 * @throws InterruptedException
	 */
	public void customWaitForElement(WebElement element) throws InterruptedException {
		int count=0;
		while(count<40)
		{
			try {
			element.isDisplayed();
			break;
		}
			catch (Throwable e) {
				Thread.sleep(5000);
				count++;
			}
	}
}
	/**
	 * This method is used to select the listbox or dropdowns based on VisibleText
	 * @param element
	 * @param visibleText
	 */
	public void select(WebElement element, String visibleText) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	/**
	 * This method is used to select the listbox or dropdown based on IndexValue
	 * @param element
	 * @param Index
	 */
	public void select(WebElement element,int Index) {
		Select sel=new Select(element);
		sel.selectByIndex(Index);
	}
	/**
	 * This method is used to move the mouse pointer to the target location
	 * @param driver
	 * @param element
	 */
	public void moveToElement(WebDriver driver, WebElement  element) {
		Actions act=new Actions(driver);
		act.moveToElement(element);
	}
	/**
	 * This method is used to switch to alert pop and click on accept
	 * @param driver
	 */
	public void gotoAlertAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * This method is used to switch to alert pop and click on cancel
	 * @param driver
	 */
	public void gotoAlertAndCancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import PageObject.BasicCheckBoxDemo;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author Patryk
 */
public class BasicCheckBoxDemoTest extends BasePageTest{
    
        private String path=chromePath;
	private RemoteWebDriver webDriver;
	private BasicCheckBoxDemo checkboxPage;

	
	public void initializeSettings() {
		checkboxPage = new BasicCheckBoxDemo(webDriver);
		checkboxPage.openViaUrl(BasicCheckBoxDemo.getUrl());
		checkboxPage.initializeElements(webDriver);
	}
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", path);
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void checkSingleBox() throws Exception {
		initializeSettings();
		checkboxPage.singleCheckboxClick();
		
		Assert.assertTrue(checkboxPage.getSingleCheckbox().isSelected());
		Assert.assertEquals("Success - Check box is checked",checkboxPage.getResultMessage().getText());
	}
	
	@Test
	public void checkThenUncheckAll() throws Exception {
		initializeSettings();
		checkboxPage.checkButtonClick();
		Thread.sleep(1000);
		checkboxPage.checkButtonClick();
		
		Assert.assertFalse(checkboxPage.getCheckOption1().isSelected());
		Assert.assertFalse(checkboxPage.getCheckOption2().isSelected());
		Assert.assertFalse(checkboxPage.getCheckOption3().isSelected());
		Assert.assertFalse(checkboxPage.getCheckOption4().isSelected());
	}
	
	@Test
	public void checkEveryoneUncheckCheckAll() throws Exception {
		initializeSettings();
		checkboxPage.checkOption1Click();
		Thread.sleep(1000);
		checkboxPage.checkOption2Click();
		Thread.sleep(1000);
		checkboxPage.checkOption3Click();
		Thread.sleep(1000);
		checkboxPage.checkOption4Click();
		Thread.sleep(1000);
		
		Assert.assertTrue(checkboxPage.getCheckOption1().isSelected());
		Assert.assertTrue(checkboxPage.getCheckOption2().isSelected());
		Assert.assertTrue(checkboxPage.getCheckOption3().isSelected());
		Assert.assertTrue(checkboxPage.getCheckOption4().isSelected());
	}
	
	@After
	public void setDown() throws Exception {
		Thread.sleep(3000);
		webDriver.close();
		webDriver.quit();
	}
}

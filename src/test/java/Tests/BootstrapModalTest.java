/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import PageObject.BootstrapModal;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
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
public class BootstrapModalTest extends BasePageTest {
    
    private String path=chromePath;
	private RemoteWebDriver webDriver;
	private BootstrapModal bootstrapPage;

	
	public void initializeSettings() {
		bootstrapPage = new BootstrapModal(webDriver);
		bootstrapPage.openViaUrl(BootstrapModal.getUrl());
		bootstrapPage.initializeElements(webDriver);
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
	public void saveFirstModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection1Click();
		Thread.sleep(2000);
		bootstrapPage.saveChangesSection1Click();
	}
	
	@Test
	public void closeFirstModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection1Click();
		Thread.sleep(2000);
		bootstrapPage.closeSection1Click();
	}
	
	@Test
	public void saveSecondModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection2Click();
		Thread.sleep(2000);
		bootstrapPage.saveChangesSection2Click();
	}
	
	@Test
	public void closeSecondModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection2Click();
		Thread.sleep(2000);
		bootstrapPage.closeSection2Click();
	}
	
	@Test
	public void saveThirdModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection2Click();
		Thread.sleep(2000);
		bootstrapPage.launchSection3Click();
		Thread.sleep(2000);
		bootstrapPage.saveChangesSection3Click();
	}
	
	@Test
	public void closeThirdModal() throws Exception {
		initializeSettings();
		bootstrapPage.launchSection2Click();
		Thread.sleep(2000);
		bootstrapPage.launchSection3Click();
		Thread.sleep(2000);
		bootstrapPage.closeSection3Click();
		Thread.sleep(2000);
		bootstrapPage.closeSection2Click();
	}
	
	@After
	public void setDown() throws Exception {
		Thread.sleep(2000);
		webDriver.close();
		webDriver.quit();
	}
}

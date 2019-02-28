/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import PageObject.FileDownloadDemo;
import static Tests.BasePageTest.chromePath;
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
public class FileDownloadDemoTest {
    
    private String path=chromePath;
	private RemoteWebDriver webDriver;
	private FileDownloadDemo fileDownloadPage;

	
	public void initializeSettings() {
		fileDownloadPage = new FileDownloadDemo(webDriver);
		fileDownloadPage.openViaUrl(FileDownloadDemo.getUrl());
		fileDownloadPage.initializeElements(webDriver);
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
	public void enterDataAndDownloadFile() throws Exception {
		initializeSettings();
		fileDownloadPage.enterDataFieldInputText("test");
		Thread.sleep(1000);
		fileDownloadPage.generateFileButtonClick();
		Thread.sleep(1000);
		fileDownloadPage.downloadFileButtonClick();
		
		Assert.assertTrue(fileDownloadPage.getDownloadFileButton().isDisplayed());
	}
	
	@After
	public void setDown() throws Exception {
		Thread.sleep(3000);
		webDriver.close();
		webDriver.quit();
	}
}

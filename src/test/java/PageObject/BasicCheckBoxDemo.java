/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicCheckBoxDemo extends BasePage {
	private final static String Url = appUrl + "basic-checkbox-demo.html";

    public BasicCheckBoxDemo(WebDriver webDriver) {
        super(webDriver);
        }
	
	public static String getUrl() {
		return Url;
	}
	
	//elements for Single Checkbox Demo
	private WebElement singleCheckbox;
	private WebElement resultMessage;
	
	//elements for Multiple CheckboxDemo
	private WebElement checkOption1;
	private WebElement checkOption2;
	private WebElement checkOption3;
	private WebElement checkOption4;
	private WebElement checkButton;
	
	//methods for Single Checkbox Demo
	public BasicCheckBoxDemo singleCheckboxClick() {
		singleCheckbox.click();
		return this;
	}
	
	public WebElement getSingleCheckbox() {
		return singleCheckbox;
	}
	
	public WebElement getResultMessage() {
		return resultMessage;
	}
	
	//methods for Multiple CheckboxDemo
	public BasicCheckBoxDemo checkOption1Click() {
		checkOption1.click();
		return this;
	}
	
	public WebElement getCheckOption1() {
		return checkOption1;
	}
	
	public BasicCheckBoxDemo checkOption2Click() {
		checkOption2.click();
		return this;
	}
	
	public WebElement getCheckOption2() {
		return checkOption2;
	}
	
	public BasicCheckBoxDemo checkOption3Click() {
		checkOption3.click();
		return this;
	}
	
	public WebElement getCheckOption3() {
		return checkOption3;
	}
	
	public BasicCheckBoxDemo checkOption4Click() {
		checkOption4.click();
		return this;
	}
	
	public WebElement getCheckOption4() {
		return checkOption4;
	}
	
	public BasicCheckBoxDemo checkButtonClick() {
		checkButton.click();
		return this;
	}
	
	public BasicCheckBoxDemo initializeElements(RemoteWebDriver webDriver) {
		singleCheckbox = webDriver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]"));
		resultMessage = webDriver.findElement(By.xpath("//*[@id=\"txtAge\"]"));
		checkOption1 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input"));
		checkOption2 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input"));
		checkOption3 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input"));
		checkOption4 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input"));
		checkButton = webDriver.findElement(By.xpath("//*[@id=\"check1\"]"));
		return this;
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RadioButtonDemo extends BasePage {
	private final static String Url = appUrl + "basic-radiobutton-demo.html";

	protected RemoteWebDriver webDriver;
	
	public RadioButtonDemo(RemoteWebDriver webDriver) {
		super(webDriver);
	}
	
	public static String getUrl() {
		return Url;
	}
	
	//elements for Radio Button Demo section
	private WebElement maleRadioButton;
	private WebElement femaleRadioButton;
	private WebElement checkButtonTier1;
	private WebElement resultMessageTier1;
	
	//elements for Group Radio Buttons Demo section
	private WebElement maleGroupRadioButton;
	private WebElement femaleGroupRadioButton;
	private WebElement zeroToFiveGroupRadioButton;
	private WebElement fiveToFifeteenGroupRadioButton;
	private WebElement fifeteenToFiftyGroupRadioButton;
	private WebElement checkButtonTier2;
	private WebElement resultMessageTier2;
	
	//methods for Radio Button Demo section
	public RadioButtonDemo maleRBClick() {
		maleRadioButton.click();
		return this;
	}
	
	public RadioButtonDemo femaleRBClick() {
		femaleRadioButton.click();
		return this;
	}
	
	public RadioButtonDemo checkButtonTier1Click() {
		checkButtonTier1.click();
		return this;
	}
	
	public WebElement getResultMessageTier1() {
		return resultMessageTier1;
	}
	
	//methods for Group Radio Buttons Demo section
	public RadioButtonDemo maleGroupRadioButtonClick() {
		maleGroupRadioButton.click();
		return this;
	}
	
	public RadioButtonDemo femaleGroupRadioButtonClick() {
		femaleGroupRadioButton.click();
		return this;
	}
	
	public RadioButtonDemo zeroToFiveGroupRadioButtonClick() {
		zeroToFiveGroupRadioButton.click();
		return this;
	}
	
	public RadioButtonDemo fiveToFifeteenGroupRadioButtonClick() {
		fiveToFifeteenGroupRadioButton.click();
		return this;
	}
	
	public RadioButtonDemo fifeteenToFiftyGroupRadioButtonClick() {
		fifeteenToFiftyGroupRadioButton.click();
		return this;
	}
	
	public RadioButtonDemo checkButtonTier2Click() {
		checkButtonTier2.click();
		return this;
	}
	
	public WebElement getResultMessageTier2() {
		return resultMessageTier2;
	} 
	
	//initialization of all elements from both sections
	public RadioButtonDemo initializeElements(RemoteWebDriver webDriver) {
		maleRadioButton = webDriver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div[1]/div[2]/label[1]/input"));
		femaleRadioButton = webDriver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div[1]/div[2]/label[2]/input"));
		checkButtonTier1 = webDriver.findElement(By.id("buttoncheck"));
		resultMessageTier1 = webDriver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div[1]/div[2]/p[3]"));
		maleGroupRadioButton = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input"));
		femaleGroupRadioButton = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input"));
		zeroToFiveGroupRadioButton = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input"));
		fiveToFifeteenGroupRadioButton = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input"));
		fifeteenToFiftyGroupRadioButton = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]/input"));
		checkButtonTier2 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"));
		resultMessageTier2 = webDriver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]"));
		return this;
	}

}

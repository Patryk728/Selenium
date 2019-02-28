/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObject;
import java.io.File;
import java.util.Properties;
import static org.apache.http.client.methods.RequestBuilder.options;
import static org.apache.http.client.methods.RequestBuilder.options;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author Patryk
 */
public class BasePage {
    
    private WebDriver webDriver;
    
    //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    protected final static String appUrl = "https://www.seleniumeasy.com/test/";
        
    public BasePage(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }
    
    public BasePage openViaUrl(String url)
    {
        webDriver.get(url);
        return this;
    }
    
}

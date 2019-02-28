/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import PageObject.AjaxFormSubmit;
import PageObject.*;
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
public class NewMain extends BasePage {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) {
    
            RemoteWebDriver driver = new ChromeDriver();
            RadioButtonDemo radio = new RadioButtonDemo(driver);
           // radio.openUrl(appUrl);
         
            radio.femaleRBClick();
    }

    public NewMain(WebDriver webDriver) {
        super(webDriver);
    }
    
}

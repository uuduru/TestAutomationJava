package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;                    

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Connect_to_internet {
 
private static WebDriver driver;
private static String string = "local";
private String session = "OFF";


public Connect_to_internet()
{

}

   
public static WebDriver get_driver(){
 if(driver == null) {
	if(string =="firefox")
	{
	 FirefoxOptions firefoxOptions = new FirefoxOptions();
	 firefoxOptions.setCapability("browserName","firefox");
	 System.out.println("Session started on remote browser in Firefox");

	 try {
		driver = new RemoteWebDriver(new URL("http://localhost:4444"),firefoxOptions);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	else if (string =="chrome")
		{
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setCapability("browserName","chrome");
			System.out.println("Session started on remote browser in Chrome browser");
			
			try {
				driver = new RemoteWebDriver(new URL("http://selenium-hub:4444"), chromeOptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	else if (string =="local")
	{
		System.out.println("Session started on localhost");
		driver = new FirefoxDriver();
		
	}
	
	return driver;
 }
 
 else {
	 
	 return driver;
 }
}
	

public static void close_driver(){
	if(driver != null)
	{
		driver.close();
		driver = null;
	}
	 
}




}

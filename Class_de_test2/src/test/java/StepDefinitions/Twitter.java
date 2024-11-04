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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import StepDefinitions.Connect_to_internet;
import org.openqa.selenium.JavascriptExecutor;


public class Twitter {


	
public WebDriver driverContext = Connect_to_internet.get_driver();


//@After
//public void tearDownforall()
//{
//	driverContext.close();
//}



@And("I look for Twitter URL")
public void je_cherche_url_de_wap() 
    {
	driverContext.get("https://twitter.com/?lang=fr");
	}


@And("I click on Create an account")
public void I_click_on_Login() 
    {
	WebDriverWait wait = new WebDriverWait(driverContext, Duration.ofSeconds(10));
	JavascriptExecutor js = (JavascriptExecutor) driverContext;
    js.executeScript("window.scrollBy(0,350)", "");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]/div[1]"))).click();
    }


@Given("I enter a {string} and a {string} on the Twitter page")
public void je_rentre_le_et_son_mot_de_passe(String string, String string2) 
    {
	WebDriverWait wait = new WebDriverWait(driverContext, Duration.ofSeconds(100));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/div[1]/div[2]/div[1]/input[1]"))).sendKeys(string);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/label[1]/div[1]/div[2]/div[1]/input[1]"))).sendKeys(string2);
    }

}

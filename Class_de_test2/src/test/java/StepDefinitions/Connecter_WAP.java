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

import com.sun.org.slf4j.internal.Logger;

import StepDefinitions.Connect_to_internet;
import StepDefinitions.Spotify;




public class Connecter_WAP {

	public WebDriver driver = Connect_to_internet.get_driver();
   
	
@After
public void tearDown()
{
	Connect_to_internet.close_driver();
}


@And("I look for Linkedin URL")
public void je_cherche_url_de_wap2() 
    {
	driver.get("https://www.linkedin.com/");
	}

@Given("I close the browser")  
public void tearDown2()
{
	System.out.println("Browser closing.");
}



@And("^I enter a \"([^\"]*)\" and a \"([^\"]*)\"$")
public void je_rentre_le_et_son_mot_de_passe(String string, String string2) 
    {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//Clicking on sign in button
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Sign in']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']"))).sendKeys(string);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']"))).sendKeys(string2);
    }

}

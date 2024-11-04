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




public class Spotify {


	
public WebDriver driverContext = Connect_to_internet.get_driver();


//@After
//public void tearDownforall()
//{
//	driverContext.close();
//}


@Given("That the browser is open")  
public void que_le_navigateur_est_ouvert() throws MalformedURLException 
   {
	
	System.out.println("Ok");	 
   }


@And("I look for Spotify URL")
public void je_cherche_url_de_wap() 
    {
	driverContext.get("https://open.spotify.com/");
	}


@And("I click on Login")
public void I_click_on_Login() 
    {
	WebDriverWait wait = new WebDriverWait(driverContext, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 gugdZL encore-inverted-light-set']"))).click();
    }


@Given("I enter a {string} and a {string} on the page")
public void je_rentre_le_et_son_mot_de_passe(String string, String string2) 
    {
	WebDriverWait wait = new WebDriverWait(driverContext, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-username']"))).sendKeys(string);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-password']"))).sendKeys(string2);
    }

}

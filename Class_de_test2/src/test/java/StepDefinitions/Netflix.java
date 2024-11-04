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


public class Netflix {


	
public WebDriver driverContext = Connect_to_internet.get_driver();


//@After
//public void tearDownforall()
//{
//	driverContext.close();
//}



@And("I look for Netflix URL")
public void je_cherche_url_de_wap() 
    {
	driverContext.get("https://www.netflix.com/fr-en/");
	}




@Given("I enter an {string}")
public void I_enter_a_e_mail(String string) 
    {
	WebDriverWait wait = new WebDriverWait(driverContext, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':r0:']"))).sendKeys(string);
    }


@And("I click on Get started")
public void I_click_on_Get_Started() 
    {
	WebDriverWait wait = new WebDriverWait(driverContext, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-uia='nmhp-card-cta+hero_card']"))).click();
    }


@And("I click on Next")
public void I_click_on_Next() 
    {
	WebDriverWait wait = new WebDriverWait(driverContext, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[placeholder='registration_button_continue']"))).click();
    }



@Given("I enter a {string} on the Netflix page")
public void je_rentre_le_et_son_mot_de_passe(String string) 
    {
	WebDriverWait wait = new WebDriverWait(driverContext, Duration.ofSeconds(100));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(string);
    }

}

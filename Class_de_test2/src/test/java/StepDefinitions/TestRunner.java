package StepDefinitions;

/*import io.cucumber.testng.*;
import io.cucumber.testng.CucumberOptions;*/

import org.junit.*;
import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"}, publish = true,
monochrome=true,
tags="@Netflix" ,
plugin= {"pretty","junit:target/JunitReports/reports.xml", 
		"json:target/JsonReports/reports.json",
		"html:target/HtmlReports/reports.html"})

public class TestRunner{

}

/*public class TestRunner extends AbstractTestNGCucumberTests {

}
*/


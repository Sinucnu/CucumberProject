package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features", glue = {"stepDefinitions"}, 
monochrome = true, plugin = {"pretty", "junit:target/JUnitReports/Junitreport.xml", "html:target/cucumber/HtlReport.html", "json:target/cucumber/JsonReport.json"})
public class TestRunner {

}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = {"classpath:features"}, glue = {"stepsDefinitions"},
    tags = "@contact_us", monochrome = true, dryRun = false,
    plugin = {"pretty", "html:target\\cucumber.html", "json:target\\cucumber.json"})


public class MainRunner extends AbstractTestNGCucumberTests {
        //@Override
        //@DataProvider(parallel = false)
        //public Object[][]scenarios(){
         //   return super.scenarios();
        }


    //}

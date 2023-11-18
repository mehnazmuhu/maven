package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="classpath:/feature",glue="stepDefination")
public class Run_log_cucumber extends AbstractTestNGCucumberTests  {

}

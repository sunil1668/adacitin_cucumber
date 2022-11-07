package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\rajit\\eclipse-workspace\\cucumber\\"
		+ "src\\test\\java\\com\\"+ "app\\feature",glue ="org.app.StepDefinition",monochrome = true, publish=true, dryRun =false,tags= "@UserOne_asmaps")
public class Runner {

}

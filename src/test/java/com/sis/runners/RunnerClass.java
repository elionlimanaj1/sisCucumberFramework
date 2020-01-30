package com.sis.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/features"
		,glue = "com/sis/steps"
		,dryRun = false
		,plugin = "pretty"
		,monochrome = true
		,tags = {"@bulent"}
		)

public class RunnerClass {

}

package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src//main//java//com/Feature",
		glue="com.stepdefs",
		dryRun =false, // it is used to compile feature file
		monochrome = true,
		strict = false,
		plugin= "html:target",
		tags = "@xyz"
		
		
		
		)


public class TestRunner {

}

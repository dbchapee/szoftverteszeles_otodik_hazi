package com.epam.szte.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		features = {"src/test/resources/features"}, 
		glue = {"com.epam.szte.bdd.hooks", "com.epam.szte.bdd.steps"},
		plugin = {"html:target/cucumber", "json:target/cucumber-json-report.json","pretty"}
		//tags = {"@shop"}
)
public class CucumberRunnerTest {

}

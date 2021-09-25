package com.autonationpractice.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="classpath:features",//to tell cucumber where is ur feature file
        glue="com.autonationpractice.stepdef", // to tell cucumber where is ur step def code
        tags="@ChangeImageColor", // to tell which tagged feature file to execute
        plugin = {"pretty", // to generate reports
        		"html:target/html/htmlreport.html",
				"json:target/json/file.json",
               
        },
        publish=false,
        dryRun=false
)
public class TestRunner {
}

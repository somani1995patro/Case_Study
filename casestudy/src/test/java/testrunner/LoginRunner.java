package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles", 
glue= {"stepdefination"},
tags="@addtocart")
public class LoginRunner {
    
}

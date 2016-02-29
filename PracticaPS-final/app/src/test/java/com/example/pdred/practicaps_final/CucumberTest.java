package com.example.pdred.practicaps_final;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty"}, features = "src/test/cucumber/features")
public class CucumberTest {}
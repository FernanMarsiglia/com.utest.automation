package com.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/utestAutomation.feature",
        tags = "@stories",
        glue = "com.utest.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
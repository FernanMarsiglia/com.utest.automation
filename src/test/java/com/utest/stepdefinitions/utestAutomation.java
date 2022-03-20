package com.utest.stepdefinitions;

import cucumber.api.java.en.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.Onstage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class utestAutomation {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }


    @Given("^than Fernan wants to join in the utest platform$")
    public void thanFernanWantsToJoinInTheUtestPlatform() {
        throw new PendingException();
    }

    @When("^he enters to the website and clicks on register$")
    public void heEntersToTheWebsiteAndClicksOnRegister() {
        throw new PendingException();
    }

    @Then("^he fills out the registration form$")
    public void heFillsOutTheRegistrationForm() {
        throw new PendingException();
    }
}

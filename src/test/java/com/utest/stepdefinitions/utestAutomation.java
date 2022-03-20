package com.utest.stepdefinitions;

import com.utest.tasks.Go;
import com.utest.tasks.Login;
import com.utest.tasks.;
import com.utest.tasks.;
import cucumber.api.java.en.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class utestAutomation {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }


    @Given("^than Fernan wants to join in the utest platform$")
    public void thanFernanWantsToJoinInTheUtestPlatform() {
        OnStage.theActorCalled("Fernan").wasAbleTo(Go.toUtestPage(), (Login.firstPage()));

    @When("^he enters to the website and fills the first register$")
    public void heEntersToTheWebsiteAndFillsTheFirtRegister() {
        OnStage.theActorInTheSpotlight().attemptsTo(Fills.theForm());
    }

    @Then("^he fills out the last part of the registration form$")
    public void heFillsOutTheLastPartOfTheRegistrationForm() {
    }
}

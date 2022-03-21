package com.utest.stepdefinitions;

import com.utest.questions.Answer;
import com.utest.tasks.Go;
import com.utest.tasks.Login;
import com.utest.tasks.Finish;
import com.utest.tasks.Fills;
import cucumber.api.java.en.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class utestAutomation {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }


    @Given("^than Fernan wants to join in the utest platform$")
    public void thanFernanWantsToJoinInTheUtestPlatform() {
        OnStage.theActorCalled("Fernan").wasAbleTo(Go.toUtestPage(), (Login.firstPage()));
    }

    @When("^he enters to the website and fills the register$")
    public void heEntersToTheWebsiteAndFillsTheRegister() {
        OnStage.theActorInTheSpotlight().attemptsTo(Fills.theForm(), (Finish.theRegister()));
    }

    @Then("^he confirm the register$")
    public void heConfirmTheRegister() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}

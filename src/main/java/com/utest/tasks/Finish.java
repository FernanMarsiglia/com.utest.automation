package com.utest.tasks;

import com.utest.userinterface.FinishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Finish implements Tasks{
    public static Finish theRegister() {
        return Tasks.instrumented(Finish.class);
    }
    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attempsTo(
        if((FinishPage.CONFIRM_PAGE).isDisplayed()) {
            Enter.theValue("Guayabon123.").into(FinishPage.INPUT_PASSWORD);
            Enter.theValue("Guayabon123.").into(FinishPage.CONFIRM_PASSWORD);
            Click.on(FinishPage.TERMSOFUSE);
            Click.on(FinishPage.TERMSOFPRIV);
            Click.on(FinishPage.COMPLETESETUP_BUTTON);
            Thread.sleep(2000);
        }
        else{
            System.out.print("Register last page was not found");
        }
        );

    }

}

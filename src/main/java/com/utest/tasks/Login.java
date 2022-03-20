package com.utest.tasks;

import com.utest.userinterface.utestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login firstPage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attempsTo(Enter.theValue("Fernan A").into(utestLoginPage.INPUT_USERFIRSTNAME),
        Enter.theValue("Marsiglia H").into(utestLoginPage.INPUT_USERLASTNAME),
        Enter.theValue("feramh96@hotmail.com").into(utestLoginPage.INPUT_EMAILADDRESS),
        Click.on(utestLoginPage.SELECT_MONTHBIRTH),
        Click.on(utestLoginPage.SELECT_DAYBIRTH),
        Click.on(utestLoginPage.SELECT_YEARBIRTH),
        Click.on(utestLoginPage.NEXT_BUTTON),
        Thread.sleep(2000)

        );
    }
}

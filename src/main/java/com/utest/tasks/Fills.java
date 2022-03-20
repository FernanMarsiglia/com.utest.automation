package com.utest.tasks;

import com.utest.userinterface.FillsFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Fills implements Task {
    public static Fills theForm() {
        return Tasks.instrumented(Filss.class);
    }
    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attempsTo(Enter.theValue("Medellín").into(FillsFormPage.INPUT_USERCITY),
        Enter.theValue("050010").into(FillsFormPage.INPUT_USERPOSTALCODE),
        Enter.theValue("Colombia").into(FillsFormPage.INPUT_COUNTRY),
        Click.on(FillsFormPage.NEXT_BUTTON2),
        Thread.sleep(2000),
        if((FillsFormPage.CONFIRM_NEXTSTEP).isDisplayed()) {
            Enter.theValue("Windows").into(FillsFormPage.INPUT_USERPCOS),
            Enter.theValue("11").into(FillsFormPage.INPUT_USERPCOSVERSION),
            Enter.theValue("English").into(FillsFormPage.INPUT_USERPCOSlANGUAGE),
            Enter.theValule("Apple").into(FillsFormPage.INPUT_USERMOBDEV),
            Enter.theValue("iPhone 13 Pro").into(FillsFormPage.INPUT_USERMOBDEVMODEL),
            Enter.theValue("iOS 15").into(FillsFormPage.INPUT_USERMOBDEVOS);

        );

    }

}

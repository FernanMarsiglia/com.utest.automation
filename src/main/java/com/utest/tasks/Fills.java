package com.utest.tasks;

import com.utest.userinterface.FillsFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.isDisplayed;

public class Fills implements Task {
    public static Fills theForm() {
        return Tasks.instrumented(Filss.class);
    }
    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attempsTo(Enter.theValue("Medellín").into(FillsFormPage.INPUT_USERCITY);
            Enter.theValue("050010").into(FillsFormPage.INPUT_USERPOSTALCODE);
            Click.on(FillsFormPage.COUNTRY);
            Click.on(FillsFormPage.NEXT_BUTTON2);
            Thread.sleep(2000);
            if(FillsFormPage.CONFIRM_NEXTSTEP).isDisplayed(); {
                Click.on(FillsFormPage.USERPCOS);
                Click.on(FillsFormPage.USERPCOSVERSION);
                Click.on(FillsFormPage.USERPCOSlANGUAGE);
                Click.on(FillsFormPage.USERMOBDEV);
                Click.on(FillsFormPage.USERMOBDEVMODEL);
                Click.on(FillsFormPage.USERMOBDEVOS);
                Click.on(FillsFormPage.NEXT_BUTTON3;
            } else {
                System.out.print("Register third page was not found");
            }

        );

    }

}

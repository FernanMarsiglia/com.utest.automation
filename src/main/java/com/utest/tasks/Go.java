package com.utest.tasks;

import com.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class Go implements Task {
    private UtestPage utestPage;
    public static Go toUtestPage() {
        return Tasks.instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attempsTo(Open.browserOn(utestPage));

    }
}

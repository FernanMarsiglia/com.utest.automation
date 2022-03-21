package com.utest.questions;

import com.utest.userinterface.FinishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.question.Text;

public class Answer implements Question<Boolean> {
    private String question = "Welcome to the world's largest community of freelance software testers!";

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String nameFinishPage= Text.of(FinishPage.NAMEFINISH_PAGE).viewedBy(actor).asString();
        if (question.equals(nameFinishPage)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}

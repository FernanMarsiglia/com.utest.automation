package com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinishPage extends PageObjectt{
        public static final Target CONFIRM_PAGE = Target.the("tells us if we advance to the next step correctly").located(By.xpath("//*[@class='signup-consent__text--highlight']"));
        public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.id("password"));
        public static final Target CONFIRM_PASSWORD = Target.the("where do we confirm the password").located(By.id("confirmPassword"));
        public static final Target TERMSOFUSE = Target.the("where do we accept the terms of use").located(By.xpath("//*[@name='termOfUse']"));
        public static final Target TERMSOFPRIV = Target.the("where do we accept the privacy and security policy").located(By.xpath("//*[@name='privacySetting']"));
        public static final Target COMPLETESETUP_BUTTON = Target.the("button to end the registration").located(By.xpath("//*[@id='laddaBtn']"));
        public static final Target NAMEFINISH_PAGE = Target.the("to confirm we did the register correctly").located(By.xpath("//*[@id='mainContent']/div/div/div[1]/div/h1"));

}

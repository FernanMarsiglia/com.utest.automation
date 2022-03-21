package com.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillsFormPage extends PageObject {
    public static final Target INPUT_USERCITY = Target.the("where do we write the city where the user lives").located(By.name("city"));
    public static final Target INPUT_USERPOSTALCODE = Target.the("where do we write the postal code where the user lives").located(By.name("zip"));
    public static final Target COUNTRY = Target.the("where do we write the country").located(By.xpath("//*[@id='ui-select-choices-row-4-49']/span/div"));
    public static final Target NEXT_BUTTON2 = Target.the("button that indicates the next step of the sign up").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target CONFIRM_NEXTSTEP = Target.the("tells us if we advance to the next step correctly").located(By.xpath("//*[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']"));
    public static final Target USERPCOS = Target.the("where do we write the user OS").located(By.xpath("//*[@id='ui-select-choices-row-5-1']/span/div"));
    public static final Target USERPCOSVERSION = Target.the("where do we write the user PC OS version").located(By.xpath("//*[@id='ui-select-choices-row-6-16']/span/div"));
    public static final Target USERPCOSlANGUAGE = Target.the("where do we write the user PC OS language").located(By.xpath("//*[@id='ui-select-choices-row-7-10']/span/div"));
    public static final Target USERMOBDEV = Target.the("where do we write the user mobile device").located(By.xpath("//*[@id='ui-select-choices-row-8-2']/span/div"));
    public static final Target USERMOBDEVMODEL = Target.the("where do we write the user mobile device model").located(By.xpath("//*[@id='ui-select-choices-row-9-84']/span/div"));
    public static final Target USERMOBDEVOS = Target.the("where do we write the user mobile device OS").located(By.xpath("//*[@id='ui-select-choices-row-10-1']/span/div"));
    public static final Target NEXT_BUTTON3 = Target.the("button that indicates the last step of the sign up").located(By.xpath("//*[@class='btn btn-blue pull-right']"));
}

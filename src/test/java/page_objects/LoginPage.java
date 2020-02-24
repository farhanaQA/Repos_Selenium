package page_objects;

import org.openqa.selenium.By;

public class LoginPage extends BagePage{


    private By ErrorMessage = By.xpath("//div[starts-with(text(),'Please enter a valid mobile number or email address'");

    //Methods
    public String getErrorMessage() {
        return getValueFromElement(ErrorMessage);
    }



}


package test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import page_objects.LandingPage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VerifyDuplicate extends DriverWrapper {

    @Test
    public void VerifyDuplicate() {


        //* Homework #3: Find out if dropdown contains duplicates, if yes fail the test and print the duplicate values

            LandingPage landingPage=new LandingPage();
            landingPage.VerifyDuplicateMonth();
    }
}
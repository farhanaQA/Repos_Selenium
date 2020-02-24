package test_Scripts;

import org.testng.annotations.Test;
import page_objects.LandingPage;

public class VerifyCurrentMonth extends DriverWrapper {


   @Test
    public void VerifyCurrentMonth() throws InterruptedException{


       //* Homework #2: Select the current month from month dropdown

            LandingPage landingPage=new LandingPage();
            landingPage.SelectCurrentMonth();
            Thread.sleep(3000);




    }



}

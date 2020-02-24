package test_Scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.BagePage;
import page_objects.LoginPage;

public class VerifiErrorMessage extends DriverWrapper {

       @Test
       public void VerifyErrorMes() throws InterruptedException {


              /**
               * Homework 1: Signup form should not accept any invalid email address
               * 1. Enter Firstname
               * 2. Enter Lastname
               * 3. Enter Invalid Email
               * 4. Click on New Password text field
               * 5. Click on red warning button on email field
               *
               * 6. Verify Error Message "Please enter a valid mobile number or email address."
               */

              LandingPage landingPage = new LandingPage();
              LoginPage loginPage=new LoginPage();

              landingPage.enterFirstName("farhana");
              Thread.sleep(3000);
              landingPage.enterLastname("bushra");
              Thread.sleep(3000);
              landingPage.enterMobileorEmail("5555666555");
              Thread.sleep(3000);
              landingPage.enterNewPassword("2334544555");
              Thread.sleep(3000);
              landingPage.clickSignUpButton();
              Thread.sleep(3000);
              landingPage.ClickOnRedWarningButton();
              Thread.sleep(3000);

              Assert.assertEquals("Please enter a valid mobile number or email address",loginPage.getErrorMessage());

              Thread.sleep(3000);

       }
}
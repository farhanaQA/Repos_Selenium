package test_Scripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import page_objects.LoginPage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    public class VerifyEmailList extends DriverWrapper {


        @Test
        public void VerifEmailList() throws InterruptedException {
            LandingPage landingPage = new LandingPage();
            ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(
                    " .abc..@example.com",
                    "  @example.com",
                    "  Joe Smith <email@example.com>",
                    "  email.example.com",
                    "  email@example@example.com",
                    "  .email@example.com",
                    "  email.@example.com",
                    "  email..email@example.com",
                    "  あいうえお@example.com"
                    , "  email@example.com (Joe Smith)",
                    "  email@example",
                    "  email@-example.com",
                    "  email@example.web",
                    "  email@111.222.333.44444",
                    "  email@example..com",
                    "  Abc..123@example.com"));
            landingPage.enterFirstName("Farhana");
            landingPage.enterLastname("bushra");
            for(int i = 0; i<arrayList.size(); i++){
                //LandingPage landingPage = new LandingPage();
                //landingPage.enterFirstName("Farhana");
                //landingPage.enterLastname("bushra");
                //System.out.println(arrayList.get(i));
                landingPage.clearMobileNumberOrEmail();
                Thread.sleep(1000);
                landingPage.enterMobileorEmail(arrayList.get(i));
                //landingPage.clickSignUpButton();
            }
        }
    }


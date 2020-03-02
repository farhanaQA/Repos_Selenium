package page_objects.Hotel;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.testng.Assert;
        import org.testng.annotations.Test;
        import test_Scripts.DriverWrapper;

        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;
        import java.util.Date;

public class SelectSevenDays extends DriverWrapper {


    @Test
    public void verifyNightStay() throws InterruptedException {


        //  Test Scenario:No .3 Verify night stay
        // 1. Goto hotels.com
        // 2. Select check in date as tomorrows date
        // 3. Select Checkout date as 7 days from tomorrow
        // 4: Assert  night value displays 7

        HotelLandingPage landingPage = new HotelLandingPage();
        landingPage.clickOnCheckInField();

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, 1);
        String newDate = dateFormat.format(cal.getTime());
        System.out.println("Check-in date as tomorrow date " + newDate);
        Thread.sleep(2000);


        landingPage.SelectCheckIndate();
        Thread.sleep(2000);
        landingPage.ClickOnCheckOutField();
        Thread.sleep(2000);
        landingPage.SelectCheckOutDate();


        String briefCase = getDriver().findElement(By.className("widget-query-num-nights")).getText();
        Thread.sleep(2000);
        System.out.println("Night Stay :" + briefCase);
        Thread.sleep(2000);
        Assert.assertEquals(briefCase, "7");


    }
}
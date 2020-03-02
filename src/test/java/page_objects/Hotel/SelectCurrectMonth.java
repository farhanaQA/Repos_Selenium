package page_objects.Hotel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import test_Scripts.DriverWrapper;

import java.text.SimpleDateFormat;
import java.util.Date;

@Test
public class SelectCurrectMonth extends DriverWrapper {

    public void SelectCurrentMonts() throws InterruptedException {


        // Classwork: Refactor current date selection scenario
        // 1. Handle the unexpected popoup (Optional)
        //  2. Check if current is focused, if not click on left arrow and select current date

        HotelLandingPage landingPage = new HotelLandingPage();
        //landingPage.clickOnPopUpEleart();
        //Thread.sleep(2000);
        landingPage.clickOnCheckInField();
        Thread.sleep(2000);
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        Date date = new Date();
        String today = sdf.format(date);
        System.out.println("Current month : " + today);
        Thread.sleep(3000);
        String month =  getDriver().findElement(By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//div[1]")).getText();
        System.out.println("Display month : " +month);
        if(!(today.equals(month))){
            System.out.println("Display Month and Current month are not equal ");
            landingPage.ClickOnleftArrow();
            Thread.sleep(2000);
        }else{
            Thread.sleep(2000);
            System.out.println("Months are equal");
        }
    }


}


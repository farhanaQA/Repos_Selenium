package page_objects.Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page_objects.BagePage;
import test_Scripts.DriverWrapper;

public class HotelLandingPage extends BagePage {


    private By RemovePopUpEleart=By.xpath("//button[@class='cta widget-overlay-close']");
    private By clickOnCheckInField=By.id("widget-query-label-1");
    private By clickOnleftArrow=By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//button[1]");
    private By getTextOfMonths=By.xpath("//div[@class='widget-daterange widget-daterange-start widget-daterange-visible widget-daterange-below']//div[1]//div[1]//div[1]");
    private By clickOnCheckOutField=By.id("widget-query-label-3");
    private By SelectCheckInDate=By.xpath("//div[6]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]");
    private By ClickOnCheckOutDate=By.xpath("//div[6]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/a[1]");

    public void clickOnPopUpEleart(){
        clickOn(RemovePopUpEleart);
    }
    public void clickOnCheckInField(){
        clickOn(clickOnCheckInField);
    }
    public void ClickOnleftArrow(){
        clickOn(clickOnleftArrow);
    }

    public void ClickOnCheckOutField(){
        clickOn(clickOnCheckOutField);
    }

    public void SelectCheckOutDate(){
        clickOn(ClickOnCheckOutDate);
    }
    public void SelectCheckIndate(){
        clickOn(SelectCheckInDate);
    }

}


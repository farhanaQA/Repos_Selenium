package test_Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page_objects.LandingPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VerifyItemPrice extends DriverWrapper {


    @Test
   // Scenario no 1.
    //Go to Amazon.com
   // Search for iPhone (or any item)
   // Verify price of first search product is between $50 - $150


    public void VerifyItemPrice() throws InterruptedException {


        LandingPage landingPage=new LandingPage();
        landingPage.setvalueOnScarchField("Iphone");
        landingPage.ClickOnScarchField();
        Thread.sleep(2000);
        String xl=getDriver().findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//span[@class='a-price']")).getText();
        System.out.print(xl.substring(1,4));
        String x2 = xl.substring(1,4);
        double priceForom = Double.parseDouble(x2);
        if(priceForom >= 50 && priceForom<= 150){
            System.out.println("the item price is between $50 - $150");}

        else{
            System.out.println("Fail");
                            }
    }


@Test
    
    public void VerifyDateIsGrater() throws InterruptedException {


        // Verify getDate is greater than today

         LandingPage landingPage=new LandingPage();
        landingPage.setvalueOnScarchField("Iphone");
        landingPage.ClickOnScarchField();
        String amazonDate = getDriver().findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//div[@class='rush-component']//div[@class='rush-component']//div[@class='s-include-content-margin s-border-bottom']//div[@class='a-section a-spacing-medium']//div[@class='sg-row']//div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']//div[@class='sg-col-inner']//div[@class='sg-row']//div[@class='sg-col-4-of-24 sg-col-4-of-12 sg-col-4-of-36 sg-col-4-of-28 sg-col-4-of-16 sg-col sg-col-4-of-20 sg-col-4-of-32']//div[@class='sg-col-inner']//div[@class='a-section a-spacing-none a-spacing-top-micro']//div[@class='a-row a-size-base a-color-secondary s-align-children-center']//div[@class='a-row s-align-children-center']//span//span[@class='a-text-bold'][contains(text(),'Tomorrow, Feb 28')]")).getText();
        System.out.println(" Get Amazon date : " + amazonDate.substring(10,16));
        String result = amazonDate.substring(10,16);

        Date date = new Date();
        SimpleDateFormat datetoString = new SimpleDateFormat("MMM dd");
        System.out.println("Current date/today date : " + datetoString.format(date));
        Date date1 = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd");
        Date date3 = null;
        try {
            date3 = formatter.parse(result);
        }
        catch(Exception ex){
            System.out.println("exception:" + ex);
        }
        if(date3.compareTo(date)<0){
            System.out.println("get date is greater than today's date");
        }else{
            System.out.println("Fail");
        }
    }
}






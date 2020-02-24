package Trail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Frist {

    @Test
    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver= new ChromeDriver();
        String url="https://www.facebook.com/";
       // driver.navigate().to(url);
        //String currentUrl=driver.getCurrentUrl();
       // Assert.assertEquals(currentUrl,url);

       /* WebDriver driver= new ChromeDriver();

        By emaillocator= By.id("email");
        WebElement email=driver.findElement(emaillocator);
        email.sendKeys("bushra882009@yahoo.com");

        By passwordLocator=By.id("password");
        WebElement password=driver.findElement(passwordLocator);
        password.sendKeys("HANnan123@W!");
*/



    }

}

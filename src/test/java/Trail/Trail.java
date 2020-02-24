package Trail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail {

    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver=new ChromeDriver();driver.get("https://www.facebook.com/");

        By emailLocator= By.id("email");
        WebElement email=driver.findElement(emailLocator);
        email.sendKeys("abc123@test.com");

    //locator
        //we can use By.id/By.name/By.className

        driver.findElement(By.id("email")).sendKeys("bushra882009@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("farhana123");
        driver.findElement(By.id("u_0_b")).click();

         By Passwordlocator=By.id("password");
        WebElement passwprd=driver.findElement(Passwordlocator);
        passwprd.sendKeys("123er ");

       driver.findElement(By.name("Fristname")).sendKeys("bushra882009@yahoo.com");
      // driver.findElement(By.className())

        //syntex no 1
        //tag[@arr='val']
        //input[@data-testid='royel_email']
        String emailXpath= "//input[@data-testid='royal_email']";
        driver.findElement(By.xpath(emailXpath)).sendKeys("jhfjhgjh");

        //syntex no 2
        //tag[text()='val']
        //a[text()='Forgot account?']
        String usingtext="/input[@id='email']";
        driver.findElement(By.xpath(usingtext)).sendKeys("hkhkkj");
        driver.quit();

        //Syntex no 3
        //tag[contains(@arr,'val']
        //input[contains(@data-testid,'royal_email']
        String usingcontains= "//input[contains(@data-testid,'royal_email']";


        //Syntex no 4
        //tag[starts-with(text(),'val')]
        //a[starts-with(text(),'Forgot account]
    }
}

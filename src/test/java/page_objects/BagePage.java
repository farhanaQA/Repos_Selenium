package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test_Scripts.DriverWrapper;

import java.util.*;


public class BagePage {

    public void clickOn(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }

    public void setValue(By locator, String value) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(value);
    }

    public String getValueFromElement(By locator) {
        return DriverWrapper.getDriver().findElement(locator).getText();
    }

    public void clearValue(By locator) {
        DriverWrapper.getDriver().findElement(locator).clear();
    }

    public void VerifyDuplicateValue(By locator) {
        Select select = new Select(DriverWrapper.getDriver().findElement(locator));
        List<WebElement> list = select.getOptions();
        Set<String> set = new HashSet<String>();
        for (WebElement element : list) {
            if (set.contains(element.getText()) == true) {
                System.out.println("Duplicate value is: " + element);
            } else {
                set.add(element.getText());
            }
        }
    }

    public boolean isElementDisplayed(By locator) {

        boolean isDisplayed;
        try {
            isDisplayed = DriverWrapper.getDriver().findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            isDisplayed = false;
        }
        return isDisplayed;

    }

    public boolean isDisplay(By loator) {

        return DriverWrapper.getDriver().findElement(loator).isDisplayed();
    }

    public boolean isSelected(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isSelected();
    }

    public boolean isEnabled(By loator) {
        return DriverWrapper.getDriver().findElement(loator).isEnabled();
    }

    public void selectByText(By locator) {
        Select select = new Select(DriverWrapper.getDriver().findElement(locator));
       // List<WebElement> list = select.selectByVisibleText();

    }

    public void selectByIndex(By locator) {
        Select selectIndex1 = new Select(DriverWrapper.getDriver().findElement(locator));
        //selectIndex1.selectByVisibleText();

    }

}
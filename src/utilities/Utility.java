package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Create the package utilities and create the class
 * with the name ‘Utility’ inside the ‘utilities’
 * package. And write the all the utility methods in
 * it’.
 */
public class Utility extends BaseTest {
    // this method click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //this method mouse hover on element and click
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();
        // actions.moveToElement(driver.findElement(by)).moveToElement(driver.findElement(by1)).click().build().perform();
    }

    public void selectByVisibleFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }
    public void assertionMethod(String message, String expected, By by) {
        String actual = getTextFromTheElement(by);
        Assert.assertEquals(" ", expected, actual);
    }
    public String getTextFromTheElement(By by) {
        return driver.findElement(by).getText();
    }
    //Mouse hover
    public WebElement mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
        return null;
    }
    public void sendTextElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    public void toClear(By by) {
        driver.findElement(by).clear();
    }

}

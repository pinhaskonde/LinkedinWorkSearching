package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.spi.LoggerFactoryBinder;

import java.util.logging.Logger;

import static org.testng.AssertJUnit.assertTrue;

public class BasePage {

    WebDriver wd;

    public WebDriverWait wait;

    public BasePage(WebDriver wd) {
        this.wd = wd;
    }



    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        wd.findElement(elementBy).click();
    }

    public void isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);
        assertTrue(wd.findElement(elementBy).isDisplayed());
    }

    public void type(By elementBy, String text) {
        wd.findElement(elementBy).sendKeys(text);
    }

    public void inputText(WebElement element, String text) {
        element.click();
        element.clear();
        element.sendKeys(text);

    }

    public String getText(By locator){
        return wd.findElement(locator).getText();
    }

}

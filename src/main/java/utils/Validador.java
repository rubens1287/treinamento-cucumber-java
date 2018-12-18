package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Validador {

    public static WebElement waitElement(WebDriver driver, By by, int timeOut) {
        return (new WebDriverWait(driver, timeOut))
                .until(ExpectedConditions.elementToBeClickable(by));
    }
}

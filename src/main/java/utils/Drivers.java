package utils;

import org.openqa.selenium.WebDriver;

public class Drivers {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Drivers.driver = driver;
    }
}

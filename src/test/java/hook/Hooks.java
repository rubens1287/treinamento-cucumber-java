package hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Drivers;

public class Hooks extends Drivers {

    private WebDriver driver;


    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resouces/chromedriver.exe");
        driver = new ChromeDriver();
        setDriver(driver);
        System.out.println("Setup");
    }

    @After
    public void tearDown() {
        getDriver().close();
        System.out.println("tearDown");
    }
}

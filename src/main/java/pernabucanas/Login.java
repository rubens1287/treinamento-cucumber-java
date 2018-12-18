package pernabucanas;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Validador;

public class Login {

    private By txtUserName = By.name("login[username]");
    private By txtPass = By.name("login[password]");
    private By btnEntrar = By.name("send");
    private By msgError = By.xpath("//div[@data-bind='html: message.text']");

    public void executaLogin(WebDriver driver, String user, String pass){
        Validador.waitElement(driver, txtUserName,30);
        driver.findElement(txtUserName).sendKeys(user);
        driver.findElement(txtPass).sendKeys(pass);
        driver.findElement(btnEntrar).click();
    }

    public void validaMsgErro(WebDriver driver, String msg){
        Validador.waitElement(driver,msgError,30);
        Assert.assertTrue(driver.findElement(msgError).getText()
                .contains(msg));
    }
}

package pernabucanas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Validador;

public class Inicial {

    private By btnConta = By.className("button-account");
    private By btnEntrar = By.linkText("Entrar");

    public void abrirApp(WebDriver driver, String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void acessarLogin(WebDriver driver){
        Validador.waitElement(driver, btnConta,30);
        driver.findElement(btnConta).click();
        driver.findElement(btnEntrar).click();
    }
}

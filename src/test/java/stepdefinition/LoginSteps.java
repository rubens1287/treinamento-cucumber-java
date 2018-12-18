package stepdefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import hook.Hooks;
import org.openqa.selenium.WebDriver;
import pernabucanas.Inicial;
import pernabucanas.Login;
import utils.Drivers;

public class LoginSteps extends Drivers {

    private WebDriver driver;
    private Inicial inicial = new Inicial();
    private Login login = new Login();

    public LoginSteps() {
        this.driver = getDriver();
    }

    @Dado("^eu estou na pagina de login$")
    public void eu_estou_na_pagina_de_login() throws Throwable {

        inicial.abrirApp(driver,"https://www.pernambucanas.com.br/");
        inicial.acessarLogin(driver);
    }

    @Quando("^eu executar o login com usario \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void eu_executar_o_login_com_usario_e_senha(String user, String pass) throws Throwable {
        login.executaLogin(driver,user,pass);
    }

    @Entao("^sera apresnetado um mensagem de erro \"([^\"]*)\"$")
    public void sera_apresnetado_um_mensagem_de_erro(String arg1) throws Throwable {
        login.validaMsgErro(driver,"Você não digitou os dados corretamente ou a sua conta está temporariamente");
    }

}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_Page;
import pageObjects.Login_Page;

import java.io.IOException;

public class Login_Steps extends Base_Page {
    private Login_Page login_page;
    public Login_Steps(Login_Page login_page){ this.login_page = login_page; }


    @Given("Yo accedo al login de la pagina Web")
    public void yo_accedo_al_login_de_la_pagina_web() throws  InterruptedException, IOException {
        login_page.navigateToUrl();
    }

    @When("Yo ingreso un nombre de usuario valido {string}")
    public void yo_ingreso_un_nombre_de_usuario_valido(String string) {
        login_page.setUsernameTxt(string);
    }
    @And("Yo ingreso una password valida {string}")
    public void yo_ingreso_una_password_valida(String string) {
      login_page.setPasswordTxt(string);
    }
    @And("Yo hago click en el boton de login")
    public void yo_hago_click_en_el_boton_de_login() {
       login_page.clickOnLoginBtn();
    }
    @Then("Yo espero que se despliegue un mensaje de login exitoso")
    public void yo_espero_que_se_despliegue_un_mensaje_de_login_exitoso() {
       login_page.validateAlertExitosa();
    }

}

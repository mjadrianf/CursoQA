package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_Page;
import pageObjects.ContactUs_Page;

public class ContactUs_Steps extends Base_Page {

    private ContactUs_Page contact_Us;

    public ContactUs_Steps(ContactUs_Page contact_Us){
        this.contact_Us=contact_Us;
    }
    @Given("Yo acceso al formulario de Contact Us")
    public void yo_acceso_al_formulario_de_contact_us() {
        contact_Us.navigateToURL();
    }
    @When("Yo ingreso el nombre de usuario valido {string}")
    public void yo_ingreso_el_nombre_de_usuario_valido(String string) {
        contact_Us.setFirstname_txt(string);
    }
    @And("Yo ingreso un apellido de usuario valido {string}")
    public void yo_ingreso_un_apellido_de_usuario_valido(String string) {
        contact_Us.setLastname_txt(string);
    }
    @And("Yo ingreso el email valido {string}")
    public void yo_ingreso_el_email_valido(String string) {
        contact_Us.setEmail_txt(string);
    }
    @And("Yo ingreso el comentario de {string}")
    public void yo_ingreso_el_comentario_de(String string) {
        contact_Us.setMessage_txt(string);
    }
    @And("Yo hago Click en el boton submit")
    public void yo_hago_click_en_el_boton_submit() {
        contact_Us.setSubmit_btn();
    }
    @Then("Yo espero que se prensente un mensaje de exito")
    public void yo_espero_que_se_prensente_un_mensaje_de_exito() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Yo ingreso el nombre de usuario valido <FirstName>")
    public void yoIngresoElNombreDeUsuarioValidoFirstName() {
    }
}

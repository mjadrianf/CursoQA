package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_Page;
import pageObjects.ContactUs_Page;

public class ContactUs_Steps extends Base_Page {

    private ContactUs_Page contact_us;

    public ContactUs_Steps(ContactUs_Page contact_us){
        this.contact_us=contact_us;
    }


    @Given("Yo acceso al formulario de Contact Us")
    public void yo_acceso_al_formulario_de_contact_us() {

        contact_us.navigateToURL();

    }
    @When("Yo ingreso el nombre de usuario {word}")
    public void yo_ingreso_el_nombre_de_usuario(String string) {

        contact_us.setFirstname_txt(string);

    }
    @And("Ingreso el apellido de {word}")
    public void ingreso_el_apellido_de(String string) {

        contact_us.setLastname_txt(string);

    }
    @And("Ingreso el email de {word}")
    public void ingreso_el_email_de(String string) {

        contact_us.setEmail_txt(string);

    }

    @And("Ingreso el comentario de {string}")
    public void ingreso_el_comentario_de(String string) {

        contact_us.setMessage_txt(string);

    }
    @And("Hago Click en el boton submit")
    public void hago_click_en_el_boton_submit() {

        contact_us.setSubmit_btn();

    }
    @Then("Yo espero que se presente un mensaje de exito")
    public void yo_espero_que_se_presente_un_mensaje_de_exito() {

        contact_us.getMessageOk_txt();

    }

    @Then("Yo espero que se presente un mensaje NO exitoso")
    public void yo_espero_que_se_presente_un_mensaje_NO_exitoso() {

        contact_us.getMessageNoOk_txt();

    }

}

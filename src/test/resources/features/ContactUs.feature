@contact_us
Feature: Contact Us Page Test Case

  Scenario Outline: Validar el envio exitoso del Formulario
    Given Yo acceso al formulario de Contact Us
    When Yo ingreso el nombre de usuario <FirstName>
    And Ingreso el apellido de <LastName>
    And Ingreso el email de <EmailAddress>
    And Ingreso el comentario de <Comment>
    And Hago Click en el boton submit
    Then Yo espero que se presente un mensaje de exito
    Examples:

      | FirstName | LastName | EmailAddress | Comment                      |
      | Maria     | Adrian   | mj@mj.cl     | "comentario de prueba"       |
      | Maria     | AdrianF  | mj1@mj.cl    | "comentario de pruebaM"      |
      | Maria     | AdrianM  | mj1@mj.cl    | "comentario de pruebaD"      |


  Scenario Outline: Validar el envio NO exitoso del Formulario
    Given Yo acceso al formulario de Contact Us
    When Yo ingreso el nombre de usuario <FirstName>
    And Ingreso el apellido de <LastName>
    And Ingreso el email de <EmailAddress>
    And Ingreso el comentario de <Comment>
    And Hago Click en el boton submit
    Then Yo espero que se presente un mensaje NO exitoso
    Examples:

      | FirstName | LastName | EmailAddress | Comment                      |
      | Maria     | Adrian   | mj@mj        | "comentario de prueba"       |
      | Maria     | AdrianF  | mj1mj.cl     | "comentario de pruebaM"      |
      | Maria     | AdrianM  | mj1@mj.      | "comentario de pruebaD"      |
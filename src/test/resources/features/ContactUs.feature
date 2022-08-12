@contact_us
Feature: Contact Us Page Test Case

  Scenario Outline: Validar el envio exitoso del Formulario
  Given Yo acceso al formulario de Contact Us
  When Yo ingreso el nombre de usuario valido <FirstName>
  And Yo ingreso un apellido de usuario valido <LastName>
  And Yo ingreso el email valido <EmailAddress>
  And Yo ingreso el comentario de <Comment>
  And Yo hago Click en el boton submit
  Then Yo espero que se prensente un mensaje de exito
  Examples:

  | FirstName   | LastName   | Comment                  | EmailAddress     |
  |-------------|------------|--------------------------|------------------|
  | "Maria"     | "Adrian"   | "comentario de prueba"   | "mj@mj.cl"       |
  |-------------|------------|--------------------------|------------------|
  | "Maria"     | "AdrianF"  | "comentario de pruebaM"  | "mj1@mj.cl"      |
  |-------------|------------|--------------------------|------------------|
  | "Maria"     | "AdrianM"  | "comentario de pruebaD"  | "mj1@mj.cl"      |

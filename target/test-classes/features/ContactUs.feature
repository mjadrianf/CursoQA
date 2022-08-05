@smokeTest
Feature: Contact Us Page Test Case

  Scenario Outline: Validar el envio exitoso del Formulario
  Given Yo acceso al formulario de Contact Us
  When Ingreso el nombre de <FirstName>
  And Ingreso el apellido de <LastName>
  And Ingreso el comentario de <Comment>
  And Ingreso el email de <EmailAddress>
  And Hago Click en el boton submit
  Then Yo espero que se prensente un mensaje de exito
  Examples:

  | FirstName   | LastName   | Comment                  | EmailAddress     |
  |-------------|------------|--------------------------|------------------|
  | "Maria"     | "Adrian"   | "comentario de prueba"   | "mj@mj.cl"       |
  |-------------|------------|--------------------------|------------------|
  | "Maria"     | "AdrianF"  | "comentario de pruebaM"  | "mj1@mj.cl"      |
  |-------------|------------|--------------------------|------------------|
  | "Maria"     | "AdrianM"  | "comentario de pruebaD"  | "mj1@mj.cl"      |

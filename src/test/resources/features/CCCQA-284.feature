@smokeTest

Feature: Upgrade de Pagina de Analitics

  Scenario: Verify the charts are updated when the Start and end date are changed
    Given Yo accedo al login de la pagina Web
    When Yo ingreso un nombre de usuario valido "Juan"
    And Yo ingreso una password valida "Juan2022"
    And Yo hago click en el boton de login
    Then Yo espero que se despliegue un mensaje de login exitoso
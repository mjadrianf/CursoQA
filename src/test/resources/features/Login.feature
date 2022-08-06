@smokeTest

Feature: Login Page de University web

  Scenario: Validar Login exitoso a la pagina web
    Given Yo accedo al login de la pagina Web
    When Yo ingreso un nombre de usuario valido "webdriver"
    And Yo ingreso una password valida "webdriver123"
    And Yo hago click en el boton de login
    Then Yo espero que se despliegue un mensaje de login exitoso


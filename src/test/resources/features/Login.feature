@smokeTest
  Feature: Login Page de University Web

    Scenario Outline: Validar Login exitoso a la pagina web
      Given Yo accedo al login de la pagina Web
      When Yo ingreso un nombre de usuario valido <username>
      And Yo ingreso una password valida <password>
      And Yo hago click en el boton de login
      Then Yo espero que se despliegue un mensaje de login exitoso
      Examples:
        | username      | password        |
        | "webdriver" | "webdriver123" |



    Scenario Outline: Validar Login No exitoso a la pagina web
      Given Yo accedo al login de la pagina Web
      When Yo ingreso un nombre de usuario valido <username>
      And Yo ingreso una password valida <password>
      And Yo hago click en el boton de login
      Then Yo espero que se despliegue un mensaje de login No exitoso
      Examples:
        | username      | password        |
        | "user" | "web" |
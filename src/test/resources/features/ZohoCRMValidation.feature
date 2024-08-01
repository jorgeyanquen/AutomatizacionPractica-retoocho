@Regresion
  Feature: Zoho CRM page automation is required
    @CasoExitoso
    Scenario: Successful registration is done on the Zoho CRM page
      Given the user wants to use Zoho CRM
      When I make the registration successful
      | username      | email                    | password   | phone      |
      | Jorge Yanquen | jorgeyanquen63@gmail.com | 1049631056 | 3214869745 |
      Then I check the access to the application
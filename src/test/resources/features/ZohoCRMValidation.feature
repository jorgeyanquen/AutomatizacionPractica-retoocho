@Regresion
  Feature: Zoho CRM page automation is required
    @CasoExitoso
    Scenario: Successful registration is done on the Zoho CRM page
      Given the user wants to use Zoho CRM
      When I make the registration successful
      Then I check the access to the application
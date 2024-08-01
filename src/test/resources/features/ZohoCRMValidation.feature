@Regresion
  Feature: Zoho CRM page automation is required
    @CasoExitoso
    Scenario: Successful registration is done on the Zoho CRM page
      Given the user wants to use Zoho CRM
      When I make the registration successful
      | username      | email                    | password   | phone      |
      | Jorge Yanquen | jorgeyanquen63@gmail.com | 1049631056 | 3214869745 |
      Then I check the access to the application

    @CasoExitosoCreaciontask
    Scenario: Successfully log in to the Zoho CRM page and create the first task
      Given I logged into Zoho CRM with a registered user
      When I create a Task
      Then I verify that the task was successfully created
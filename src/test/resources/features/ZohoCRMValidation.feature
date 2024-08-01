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
      Given Entering the Zoho CRM page
      And I logged into Zoho CRM with a registered user
      | email1                   | password1  |
      | jorgeyanquen63@gmail.com | 1049631056 |
      When I create a Task
      | subject | date       | status      | priority | description |
      | llamada | 31/08/1992 | Not Started | High     | Task 1      |
      Then I verify that the task was successfully created
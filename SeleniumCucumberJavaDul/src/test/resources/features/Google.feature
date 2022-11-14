
Feature: Probar la busqueda en Google
    @Google
Scenario:  As a user I enter Search criteria in Google
    Given I am on the Google search page
    When I enter a search criteria
    And I click on the search button

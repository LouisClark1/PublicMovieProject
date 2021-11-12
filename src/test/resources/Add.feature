Feature: Add
  As a user I want to add films that aren't in the database so that future searches will show the new films
  Scenario: Adding a film to the database with incomplete data
    Given I only know some of the information for a new film
    When I input the incomplete data
    Then I recieve an error message saying "a new entry cannot be entered with incomplete data"

  Scenario: Adding a film to the database
    Given I know all the information for the film I want to add
    When I input all the information
    Then The database is updated

#  Scenario: Adding a film without permission
#    Given I do not have permission to edit the database
#    When I try to add a film to the database
#    Then a message is shown saying you do not have permission


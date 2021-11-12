Feature: Edit
  As a user I want to edit data in the data base so that the data can be corrected so that the database can improve in accuracy
  Scenario: Editting the information in the database
    Given I have permission to edit the database
    When I send updated data
    Then the database updates

    Scenario: Trying to edit information without permission
      Given I do not have permission to edit the database
      When I try to edit the data
      Then a message is shown saying you do not have permission
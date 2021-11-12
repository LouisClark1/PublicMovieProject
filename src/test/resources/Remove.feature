Feature: Remove
  As a user I want to be given a random film suggestion so that I can watch it
  Scenario: Removing entries from the database
    Given I have permission to edit the database
    When I find a film that does not exist and try to remove it
    Then the entry is removed from the database

#  Scenario: Trying to remove entries from the database without permission
#    Given I do not have permission to edit the database
#    When I try to edit the data
#    Then a message is shown saying you do not have permission

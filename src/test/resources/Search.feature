Feature: Search
  As a user I want to search for information about films so that I can learn it
  Scenario: Searching film title
    Given that I only know the film title that I want to search for
    When I search the film title
    Then Results that match the search are returned

#  Scenario: Searching by actor
#  Given I only know the actor that I want to search for
#  Then I search the actors name
#  When Results that match that actor are returned
#
#  Scenario: Searching by genre
#  Given I only know the genre that I want to search for
#  Then I search the genre
#  When results mtching that genre are returned
#
#  Scenario: Searching by a combination of actor, genre and title
#  Given I know a combination of actor, genre and title that I want to search for
#  Then I search with data in more than one field
#  When results matching at least one of the search terms is returned
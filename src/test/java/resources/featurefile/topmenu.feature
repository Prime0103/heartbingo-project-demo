@regression
Feature: TopMenu functionalities
  As a user I want to verify HeartBingo TopMenu Tabs

  @smoke
  Scenario:  User should navigate to heartBingo page successfully
    Given  I am on HomePage
    When   I click on Bingo link
    Then   I should navigate to Bingo Page successfully

#  @sanity
#  Scenario : User should navigate to heartBingo page successfully
#    Given  I am on HomePage
#    When   I click on Slots link
#    Then   I should navigate to Slots Page successfully
#    And    I click on  "Magic Jokers" slot
#    Then   i should click to Magic Jokers page
#
#  @sanity
#  Scenario: User should navigate to heartBingo page successfully
#    Given  I am on HomePage
#    When I click on Casino link
#    Then I should navigate to Casino Page successfully
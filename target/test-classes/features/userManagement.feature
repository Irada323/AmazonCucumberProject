#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

 @amazon
 Feature: Amazon Search items
 all the users should be able to search any items they want
 
  Background:
   Given I am on the Amazon home page
   
 @amazonSearch
  Scenario: Search for Coffee Mug
   
    And I should be able to see the title
    When I click on the dropdown button
    And I should see All department as a default
    When I select Home & Kitchen department
    When I search for Coffee Mug
    Then I validate I am on coffee mug search results page
    And I verify I am on the Home & Kitchen department

  
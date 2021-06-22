Feature: Login Feature
  Verify if user is able to Login to the site

 
  Scenario: Login as an authenticated user
    Given User is on homepage
    When User navigates to Login page
    And User enters username and password
    Then Success message is displayed

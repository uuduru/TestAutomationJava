@Twitter
Feature: Connect to Twitter
@Regression1
  Scenario Outline: Connect to Twitter
    Given That the browser is open
    And I look for Twitter URL
    And I click on Create an account
    And I enter a <username> and a <password> on the Twitter page 
    Then I close the browser
    @Données_1
    Examples:
			| username							   				 |password   |
			| "uzoboss@yopmail.com"					 |"password" |
			| "ugoboss@gmail.com"					     |"password" |

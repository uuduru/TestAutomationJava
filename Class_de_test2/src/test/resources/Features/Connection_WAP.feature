@Linkedin
Feature: Connect to Linkedin
@Regression1
  Scenario Outline: Connect to Linkedin
    Given That the browser is open
    And I look for Linkedin URL
    And I enter a <username> and a <password> 
    Then I close the browser
    @Données_1
    Examples:
			| username							   				 |password   |
			| "uzoboss@yopmail.com"					 |"password" |
			| "ugoboss@gmail.com"					     |"password" |

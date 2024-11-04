@Netflix
Feature: Connect to Netflix
@Regression2
  Scenario Outline: Connect to Netflix website
    Given That the browser is open
    And I look for Netflix URL
    And I enter an <e-mail>
    And I click on Get started
    And I click on Next
    And I enter a <password> on the Netflix page 
    Then I close the browser
    @Données_1
    Examples:
			| e-mail							   				 |password   |
			| "uzoboss@yopmail.com"					 |"password" |
			| "ugoboss1500@gmail.com"					     |"password" |

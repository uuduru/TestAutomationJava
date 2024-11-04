@Spotify
Feature: Spotify
@Regression2
  Scenario Outline: Spotify
    Given That the browser is open
    And I look for Spotify URL
    And I click on Login
    And I enter a <username> and a <password> on the page
    Then I close the browser
    @Données_1
    Examples:
			| username							   				 |password   |
			| "uzoboss@yopmail.com"					 |"password" |
			| "ugoboss@gmail.com"					     |"password" |
			
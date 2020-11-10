Feature: Checking Background Verification


	Background: User should be on LoginPage
		Given I launch application in Chromebrowser
		Then Application should be launch
		When I Enter username
		And I Enter password
		When I click on Loginbutton
		Then I validate title of the Homepage
		Then I am creating object for loginHomepage
		
  Scenario: Title of your scenario
    Given I click on Users
    Then I validate the UsersHomepage
   
  Scenario: Title of Branch Validation
  	Given I click on Branches
  	Then I validate title of the BranchPage

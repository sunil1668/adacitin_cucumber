Feature: login page testing
# Here three scenarios will run, but if we give @ then only that particular tag will be given in ruuner class so that particular
# scenario will alone run#
#one more thing is here in scenario cases we can pass only one arguments#
   
 		@sunil
 		Scenario: Validate the valid username and password
    Given Enter the URL
    When Enter the Username "Aiite"
    And Enter the password "1234"
    And Click the login button
    Then Validate the Home page title
    
    @ajith
    Scenario: Validate the another username and password
    Given Enter the URL
    When Enter the Username "ETIIA"
    And Enter the password "4567"
    And Click the login button
    Then Validate the Home page title
  
   @sowmya
   Scenario: Validate the another username and password
    Given Enter the URL
    When Enter the Username "sowmy"
    And Enter the password "123"
    And Click the login button
    Then Validate the Home page title
    
    #scenario outline here we will write only single scenario but we will pass multiple arguments#
   @scenariooutline
    Scenario Outline: Validate the invalid username and valid password
	  Given Enter the URL
		When Enter the user "<username>"
		And Enter the pass "<password>"
		And Click the login button
		Then Validate the Home page title
		
		Examples:
		|username|password|	
		|ajith|sunil|
		|ajith|sunil|
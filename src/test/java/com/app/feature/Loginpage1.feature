Feature: Login Page testing

	@UserOne_asList
  Scenario: Validate the valid username and password
    Given Enter the link of the website
    When Enter the User
    |Aiite1|
    |Aiite2|
    |Aiite3|
    #And Enter the password "1234"
    #And Click the login button
    
    @UserOne_asLists
    Scenario: Validate the valid username and password
   #Given Enter the link of the website
    When Enter the User for aslist
    |sunil|ajith|
    |sunil|sowmya|
    |ajith|sunil|
    #And Enter the password "1234"
    #And Click the login button
    
    @UserOne_asmap
    Scenario: Validate the valid username and password
   #Given Enter the link of the website
    When Enter the User for asmap
    |sunil|ajith|
    |jeyanthi|sowmya|
    |ajith|sunil|
    #And Enter the password "1234"
    #And Click the login button
    
    
      @UserOne_asmaps
    Scenario: Validate the valid username and password
   #Given Enter the link of the website
    When Enter the User for asmaps
    |firstname|lastname|
    |jeyanthi|sowmya|
    |ajith|sunil|
    #And Enter the password "1234"
    #And Click the login button
Feature: User able to successfull login into HRMS application

  Scenario: Successfull Login into Application and Logout
    
    Given Open Application
    And Enter URL
    When Login to Applocation using <username> and <password>  #when we provide credentials from here
    When Logout Application
    Then Closed Application
   
   #Below are the syntax for credentials. 
    Examples:
    |username|password|
    |syed131|Syed3194@|
    |Admin|admin123|


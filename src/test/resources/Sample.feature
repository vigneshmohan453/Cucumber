Feature: To validate the login functionality of facebook application

Background: 
Given To launch the chrome browser and maximise the window

#Scenario: To validate  login with valid username and invalid password
#When To launch the url of facebook application
#And To pass valid username  in email field
#And To pass invalid password in password field
#And To click the login button
#And To check whether navigate to the home page or not
#Then close the browser

Scenario Outline: To verity the positive and negative scenario of the Facebook
When To launch the url of facebook application
And To pass valid username  in "<username>" email field
And To pass invalid password in "<password>" password field
And To click the login button
Then close the browser

Examples:
|username			|password    |
|vignesh			|12345			 |
|ganesh				|34343			 |
|rajesh				|34343			 |
|suresh				|76676			 |
|mahesh				|67676			 |















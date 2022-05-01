Feature: Create Lead functionality of Leaftaps application

#Background:
#Given Open the chrome browser
#And Load the application url

@functional
Scenario: TC003_Create new lead with mandatory information
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA and Leads
When Click on Create Lead
Then Enter required details and click Submit
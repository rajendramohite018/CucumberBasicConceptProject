Feature: Portal login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started 

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username and password
Then Home page is populated 
And Cards are displayed

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "jin" and password "1234"
Then Home page is populated 
And Cards displayed are "true"

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "john" and password "12345"
Then Home page is populated 
And Cards displayed are "false"





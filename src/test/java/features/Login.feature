Feature: Application login_1

@RegTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "jin" and password "1234"
Then Home page is populated 
And Cards displayed are "true"

@SmokeTest #@RegTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "john" and password "12345"
Then Home page is populated 
And Cards displayed are "false"

@WebTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following below details
| jimmy | abcc | abcd@gmail.com | Pune | 12324455	|
Then Home page is populated 
And Cards displayed are "false"

@RegTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with username <username> and password <password>
Then Home page is populated 
And Cards displayed are "True"

Examples: 
| username | password |
| user1    | pass1    |
| user2    | pass2    |
| user3    | pass3    |


Feature: Application Login

Scenario: Home Page default Login

Given User is on NetBanking landing page
When User Login into application with username and password
Then Home Page is Populated
Then Cards are displayed

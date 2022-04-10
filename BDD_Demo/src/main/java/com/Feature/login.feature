 Feature: JBK offline application

@jbk
Scenario Outline: login test

Given user should be on login page
When  user enters "<uname>" and "<pass>"
Then  user should be on home pages

Examples:
|uname            |pass  |
|kiran@gmail.com  |123456|
|mangesh@gmail.com|urfru |
|bharat@gmail.com |wdgdu |

Scenario: logo test
Given user should be on login page
Then  user should see JBK logo


Scenario: add user
Given user should be on login page
When  user enters valid credentials
Then  user should see Users  

@abc
 Scenario: Log in with valid username and password
 Given user should be on login page
 When  user enters valid credentials
 | kiran@gmail.com | 123456 |
 Then user should be on home pages
 
 @xyz
 Scenario: Log in with valid username and password
 Given user should be on login page
 When  user enters valid credentials
 | user            | password|
 | kiran@gmail.com | 123456 |
 Then user should be on home pages




















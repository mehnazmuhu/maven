Feature:I want to login to the application

Background:I want to login to the application
Given open browser
And I opne login page

Scenario:I want to login to the application

When I enter my username 
And I enter my password
And I should click submit
Then I should get confirmation message

Scenario: I want to login invalid

When I enter my valid username
And I enter my invalid password
And I should click submit 
Then I should get invalid password message




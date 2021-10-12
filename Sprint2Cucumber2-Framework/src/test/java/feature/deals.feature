Feature: BigBasket Deals

Scenario: Test Popularity button is working
Given User is in home page
When User clicks on Deals button
And User clicks on Sort button
Then User clicks on Popularity button

Scenario: Test Price(low-high) button is working
Given User is in home page
When User clicks on Deals button
And User clicks on Sort button
Then User clicks on Price(low-high) button

Scenario: Test Alphabetically button is working
Given User is in home page
When User clicks on Deals button
And User clicks on Sort button
Then User clicks on Alphabetically button
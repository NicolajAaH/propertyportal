Scenario: I am navigated to post property page when I click on post property

Given I am on the page frontpageLandlordSignedIn
When I click on postButton
Then the page postProperty is displayed for me

Scenario: I am navigated to frontpage when I am on post property page, and when I fill out all required fields and I click save

Given I am on the page postProperty
When I fill addressInputText with Address
And I fill priceInputText with 5000
And I fill sizeInputText with 90
And I check flatCheck
And I check furnishedCheck
And I click on saveButton
Then the page frontpageLandlordSignedIn is displayed for me


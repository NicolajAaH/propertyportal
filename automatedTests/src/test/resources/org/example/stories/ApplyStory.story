Scenario: I am navigated to apartment page when I click on property

Given I am on the page frontpageSignedIn
When I click on property1
Then the page property1 is displayed for me

Scenario: I am navigated to apply page when I click on apply

Given I am on the page property1
When I click on applyButton
Then the page apply is displayed for me

Scenario: I am navigated to property when I click apply for property

Given I am on the page apply
When I fill descriptionText with Description about me
And I click on applyButton
Then the page property1 is displayed for me

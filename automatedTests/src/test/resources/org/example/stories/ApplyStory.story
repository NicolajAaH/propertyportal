Scenario: I am navigated to apartment page when I click on property

Given I am on Frontpage_signed_in
When I click on property1
Then property is displayed for me

Scenario: I am navigated to apply page when I click on apply

Given I am on property
When I click on applyBtn
Then apply is displayed for me

Scenario: I am navigated to property when I click apply for property

Given I am on apply
When I fill descriptionText with Description about me
And I click on applyBtn
Then property is displayed for me

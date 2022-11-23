Scenario: Navigate to apartment page when property is clicked

Given I am on Frontpage_signed_in
When I click on property1
Then property is displayed for me

Scenario: Navigated to apply page when apply is clicked

Given I am on property
When I click on applyBtn
Then apply is displayed for me

Scenario: Navigated to property when apply for property is clicked

Given I am on apply
When I click on applyBtn
Then property is displayed for me



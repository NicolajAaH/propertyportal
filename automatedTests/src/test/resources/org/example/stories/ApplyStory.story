Scenario: Navigate to apartment page when property is clicked

Given on Frontpage_signed_in
When property1 is clicked
Then navigated to property

Scenario: Navigated to apply page when apply is clicked

Given on property
When applyBtn is clicked
Then navigated to apply

Scenario: Navigated to property when apply for property is clicked

Given on apply
When applyBtn is clicked
Then navigated to property



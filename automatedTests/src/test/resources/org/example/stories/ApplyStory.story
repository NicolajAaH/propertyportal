Scenario: navigate to appartment page

Given on Frontpage_signed_in
When property1 is clicked
Then navigated to property

Scenario: another scenario

Given on property
When applyBtn is clicked
Then navigated to apply

Scenario: and another

Given on apply
When applyBtn is clicked
Then navigated to Frontpage_signed_in



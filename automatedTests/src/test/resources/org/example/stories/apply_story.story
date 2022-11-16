Feature: A story is a collection of scenarios

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development

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
Then navigated to Fonrtpage_signed_in



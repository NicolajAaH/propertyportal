Feature: A story is a collection of scenarios

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development

Scenario: navigate to appartment page

Given on 'frontpage_signed_in'
When 'apartment' is clicked
Then navigated to 'apartmentpage'

Scenario: another scenario

Given on 'apartmentpage'
When 'apply' is clicked
Then navigated to 'applypage'

Scenario: and another

Given on 'applypage'
When 'apply' is clicked
Then navigated to 'apartmentpage'



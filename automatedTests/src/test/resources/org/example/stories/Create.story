Scenario: I am navigated to post property page when I click on post property

Given I am on Frontpage_landlord_signed_in
When I click on postBtn
Then post_property is displayed for me

Scenario: I am navigated to frontpage when I am on post property page, and when I fill out all required fields and I click save

Given I am on post_property
When I fill addressInputText with Address
And I fill priceInputText with 5000
And I fill sizeInputText with 90
And I check flatCheck
And I check furnishedCheck
And I click on saveBtn
Then Frontpage_landlord_signed_in is displayed for me

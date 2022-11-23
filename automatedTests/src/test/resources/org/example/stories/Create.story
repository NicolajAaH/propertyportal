Scenario: Navigated to post property page when post property is clicked

Given I am on Frontpage_lender_signed_in
When I click on postBtn
Then post_property is displayed for me

Scenario: On post property page, when filling out all required fields and save is clicked, it is navigated to frontpage

Given I am on post_property
When I fill addressInputText with Address
And I fill priceInputText with 5000
And I fill sizeInputText with 90
And I check flatCheck
And I check furnishedCheck
And I click on saveBtn
Then Frontpage_lender_signed_in is displayed for me





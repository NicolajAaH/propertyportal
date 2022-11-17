Scenario: Navigated to post property page when post property is clicked

Given on Frontpage_lender_signed_in
When postBtn is clicked
Then navigated to post_property

Scenario: On post property page, when filling out all required fields and save is clicked, it is navigated to frontpage

Given on post_property
When addressInputText is filled with Address
And priceInputText is filled with 5000
And sizeInputText is filled with 90
And flatCheck is checked
And furnishedCheck is checked
And saveBtn is clicked
Then navigated to Frontpage_lender_signed_in





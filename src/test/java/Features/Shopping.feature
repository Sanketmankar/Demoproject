Feature: Create Account
  @regression
  Scenario Outline: Successful Login with valid credentials
    Given User launches a browser
    Then user hits the url
    Then user clicks on sign in
    Then user enters mailId and creates account
    Then user enters the personal information as "<First_name>", "<last_name>", "<password>"
    And user enters address details as "<Address_line1>", "<Address_line2>","<City>", "<Postcode>"

    Examples:
      |First_name|last_name|password|Address_line1|Address_line2|City|Postcode|
      |Andrew    | Strauss |Straus@1947|Marol     |Andheri      |Mumbai|45678 |


  @Samtest1
  Scenario Outline: Sign in And Shop
    Given User launches a browser
    Then user hits the url
    Then user clicks on sign in
    Then user enters "<email>" and "<Password>"
    Then user mousehovers on women category
    Then user selects an option Blouses
    Then user mousehovers on a product
    Then user clicks on add to cart
    Then user clicks on Proceed to checkout
    Then user Again clicks on Proceed to checkout
    Then user Further clicks on Proceed to checkout
    Then user clicks the checkbox for agrreing the terms
    Then user Finally clicks on Proceed to checkout
    Then user clicks on Pay by bank wire
    Then User confirms the order
    Examples:
      |email|Password|
      |Sanket1591@gmail.com|Straus@1947|


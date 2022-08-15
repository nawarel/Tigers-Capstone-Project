@test
Feature: Desktops Tab

  Background: 
  
    Given User click on Desktops tab
    And User click on Show all desktops
    

  Scenario: User verify all items are present in Desktops tab
    Then User should see all items are present in Desktop page

  Scenario: User add HP LP 3065  from Desktops tab to the cart
   
    And User click  ADD TO CART option on HP LP3065item
    And User select quantity '1'
    And User click add to Cart button
    #Then User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’
   

  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    And User click  ADD TO CART option on Canon EOS 5Ditem
    And User select color from dropdown RedAnd User select quantity 1
    And User click add to Cart button
    Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’

  Scenario: User add a review to Canon EOS 5D item in Desktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information
      | yourname | yourReview                                                                                                                                                                                                    | Rating |
      | sana    | I’m absolutely impressed!! Actually, it could not have been better as it was well beyond my expectations the product it good  i will recommand for everyone really i love it specialyy the features work good |      5 |
    And User Click on Continue button
    Then User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”

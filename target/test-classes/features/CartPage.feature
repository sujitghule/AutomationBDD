# Author:  Sujit k. Ghule
# Date:    
# Description: Test com.automationPractice-BDD FW

@CartPageTest
Feature: All test on product page of web application

Verify that 'Add to Wishlist' only works after login.

@BuyOrderfunctionality 
Scenario:
 Given User open the browser
When user_login username "ghulesujit1@gmail.com" and password "sujit1234@"
Then Move your cursor over Women link and Click on sub menu T-shirts
And  Mouse hover on the product displayed and click on More Button
And Increase quantity  and Select size L and Select color
Then Click Add to Cart button and Click Proceed to checkout button
And Complete the buy order process till payment
And  Make sure that Product is ordered



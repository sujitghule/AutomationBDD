# Author:  Sujit k. Ghule
# Date:    
# Description: Test com.automationPractice-BDD FW

@ProductPageTest
Feature: All test on product page of web application

	9. Validate products are matching with the name
	10. Fetch the all product price and get its total
	11. Send a Friend Feature
	12. Change in the image using Color Feature
  17. Validate cart value is updating
  18. Validate same products added in cart
  20. Validate a product can be removed from cart feature



@ValidateSearchBox
Scenario: Validate the search box is enabled to perform sendkeys operation.
Given User open the browser
And Search for the product "Dress" in the given search box
Then Fetch the result and print the result
    
@AllProductPriceAndTotal
Scenario: Fetch the all product price and get its total
Given User open the browser
When Validate "DRESSES" option is displayed with all characters in Uppercase
And Click on the DRESS section
Then Fetch all the prices Make the sum of all products
   
@SendaFriendFeature
Scenario Outline:: Validate send product link message
Given User open the browser
When user login username "ghulesujit1@gmail.com" and password "sujit1234@" 
Then user click on T-shirt category
And user click on More
And user click on Send to a Friend
And Fill the details "<Freind Name>" and "<Freind Maild ID>" click on Send button.
And user Validate the Message appeared in the Email sent 

  Examples: 
      | Freind Name 				| Freind Maild ID  			 |
      | mahesh nikam        | maheshnikam1@gmail.com |
      
@ChangeImageColor
Scenario: User Change in the image using Color Feature
Given User open the browser
And user click on T-shirt category
And Click on Color Blue link
Then Check the Image is changed
    
@Validatecart
Scenario: Validate cart product value
Given User open the browser
When user add three product in cart 
Then user validate the cart product value  
     
@validatecartproductsame
Scenario: validate cart product details
Given User open the browser
When user add three product in cart 
Then user validate add same product in cart    
      
  
   
  
      
      

# Author:  Sujit k. Ghule
# Date:    
# Description: Test com.automationPractice-BDD FW
@LandingPageTest
Feature: All test on landing page of web application
  
  Test No :
  				13. Validate Facebook Social Media Handle
  				14. Validate Twitter Social Media Handle
       	  15. Validate Youtube Social Media Handle

 
@Youtube
  Scenario: Youtube validation
    Given User open the browser
	Then user verify that successfully visited Youtube page
	
	
@Twitter
 Scenario: Twitter validation
  Given User open the browser
	Then user verify that successfully visited Twitter page
	
	
@facebook
 Scenario: Facebook Validation
 Given User open the browser
	Then user verify that successfully visited fb page
	
  

  
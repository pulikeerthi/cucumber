Feature: MyAccount-Login Feature
Description: This feature will test a Login feature

 #Simple login without parameters
 Scenario: Log-in with valid username and password
 Given Open the browser
 When Enter the URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
 And Enter registered username and password
 And Click on login button
 Then User must successfully login to the web page
 
 
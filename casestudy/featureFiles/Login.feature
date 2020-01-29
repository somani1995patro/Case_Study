Feature: Register

Scenario: Register on TestMeApp
Given user open TestMeApp
When user click signup
And enter username as "Somani123"
And enter firstname as "Somani"
And enter lastname as "Patro"
And enter password as "Somani123"
And enter confirm password as "Somani123"
And user select gender as "Female"
And enter email as "patrosomani@gmail.com"
And enter mobile number as "7978163722"
And enter dob as "11/12/1995"
And address as "Pune"
And select security question "What is your Birth PLace?"
And enter answer "Odisha"
Then click Register

@login
Scenario: Login using datatable
 Given user open TestMeApp
 When user click signin
 And user enter  credentials as 
    |lalitha|
    |Password123|
    

@addtocart    
Scenario: add to cart
Given user open TestMeApp
When user click signin
And user enter credentials as
  |lalitha|
  |Password123|
 And enters item as 
 |Headphone|
 Then click add to cart 
 
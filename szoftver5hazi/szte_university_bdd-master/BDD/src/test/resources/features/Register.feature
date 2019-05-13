Feature: Register
  I want to test the register

  
  Scenario: Testing the registering
  	Given I open the My Store page
		When I click on the Sign in button
		Then I can see the Register us page
		When I  write email address "asada1234@sada.com"
		Then I see my email is "asada1234@sada.com"
		When I click on create Button
		And I write "Ferenczi" into FirstName field
		Then I see my firstname is "Ferenczi"
		When I write "Kristof" into LastName field
		Then I see my lastname is "Kristof"
		When I write "password" into passwd field
		Then I see my pw is "password"
		When I write "Ferenczi" into Address FirstName field
		Then I see my Address Firstname is "Ferenczi"
		When I write "Kristof" into Address LastName field
		Then I see my Address LastName is "Kristof"
		When I write "Szeged vajda utca 3" into Address field
		Then I see my Address is "Szeged vajda utca 3"
		When I write "Szeged" into City field
		Then I see my City is "Szeged"
		When I write "6723" into Zipcode field
		Then I see my Zipcode is "6723"
		When I write "06708909663" into Phonenumber field
		Then I see my Phonenumber is "06708909663"
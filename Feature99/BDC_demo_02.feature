Feature: BDC validation on demowebshop
 

@Regression

Scenario: Registered user access to cart in demowebshop


Given user launch demowebshop app in chrome browser


Then user user searches for the item of his choice


And adds the item to the cart

@Sanity



Scenario: Registered user access track the ordered item in Demowebshop


Given user has already placed an order for his favourite item


And user tries to access the order tracking dashboard


Then identifies the state of the order
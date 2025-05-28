package com.designpattern.strategy.payment;

class CreditCardPayment implements PaymentStrategy {

	private String cardNumber;

	public CreditCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println("Paid: " +  amount + " using the card: " + cardNumber);
	}	
}
/*
 * 
 * Purpose: The Strategy Pattern is used to define a family of algorithms,
 * encapsulate each one as a separate class, and make them interchangeable. The
 * Strategy pattern lets the algorithm vary independently from clients that use
 * it. This is particularly useful when you need to select an algorithm at
 * runtime based on some condition.
 * 
 * Structure: Strategy Interface: Declares a common interface for all supported
 * algorithms. Concrete Strategies: Implement the strategy interface, each
 * providing a different implementation of the algorithm. Context: Holds a
 * reference to a strategy object and allows the client to set or change the
 * strategy.
 * 
 * Use Cases 
 * 1.Payment Processing Systems: 
 * Scenario: In an e-commerce application, you might want to offer different
 * payment options like credit card, PayPal, or bank transfer. Solution: Use the
 * Strategy Pattern to encapsulate the payment methods. The user can select a
 * payment method at checkout, and the system will execute the selected
 * strategy. 
 * 
 * 2.Sorting Algorithms: 
 * Scenario: A program may need to sort data in different ways (e.g., quicksort,
 * mergesort) depending on the size or nature of the data. Solution: Implement
 * the sorting algorithms as strategies and allow the program to choose the most
 * appropriate one at runtime. 
 * 
 * 3.File Compression: 
 * Scenario: An application may support different file compression algorithms
 * (e.g., ZIP, RAR, 7z). Solution: Use the Strategy Pattern to encapsulate these
 * algorithms and let the user select the desired compression method.
 * 
 * 4.Authentication Mechanisms: 
 * Scenario: A system may need to authenticate users using different methods
 * (e.g., OAuth, LDAP, JWT). Solution: Implement the authentication methods as
 * strategies and allow the system to select the appropriate method based on the
 * user's configuration or preferences.
 
*/
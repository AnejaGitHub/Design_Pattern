package com.designpattern.strategy.payment;

public class StrategyMain {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.setPaymentStrategy(new CreditCardPayment("6787-5687-4356-2343"));
		cart.checkout(4500);
		
		cart.setPaymentStrategy(new PayPalPayment("singh@email.com"));
		cart.checkout(5400);
	}
}

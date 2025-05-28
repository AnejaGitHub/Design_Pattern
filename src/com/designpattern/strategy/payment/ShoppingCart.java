package com.designpattern.strategy.payment;

class ShoppingCart {

	private PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	/**
	 * This method will checkout your order
	 * @param amount: total amount to pay
	 */
	public void checkout(int amount) {
		if(paymentStrategy == null) {
			throw new IllegalStateException("Payment strategy not set");
		}
		paymentStrategy.pay(amount);
	}
}

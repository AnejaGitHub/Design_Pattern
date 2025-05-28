package com.designpattern.observer.newschannelsubscribers;

public class SMSSubscriber implements Observer {
	private String phoneNumber;

	public SMSSubscriber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println("SMS sent to " + phoneNumber + ": " + message);
	}

}

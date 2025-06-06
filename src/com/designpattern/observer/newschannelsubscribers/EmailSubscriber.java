package com.designpattern.observer.newschannelsubscribers;

public class EmailSubscriber implements Observer {

	private String email;
	
	public EmailSubscriber(String email) {
		this.email = email;
	}
	@Override
	public void update(String message) {
		System.out.println("Email sent to " + email + ": " + message);
	}

}

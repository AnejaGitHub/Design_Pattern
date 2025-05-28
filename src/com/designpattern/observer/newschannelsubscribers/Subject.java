package com.designpattern.observer.newschannelsubscribers;

public interface Subject {

	void attach(Observer observer);
	void detach(Observer observer);
	void notifyObservers();
	
}

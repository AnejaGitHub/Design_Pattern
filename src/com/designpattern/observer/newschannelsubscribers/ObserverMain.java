package com.designpattern.observer.newschannelsubscribers;

public class ObserverMain {

	public static void main(String[] args) {
		NewsChannel newsChannel = new NewsChannel();

		EmailSubscriber emailSubscriber = new EmailSubscriber("singh@email.com");
		SMSSubscriber smsSubscriber = new SMSSubscriber("96876711340");

		newsChannel.attach(emailSubscriber); // attached email subscriber
		newsChannel.attach(smsSubscriber); // attached sms subscriber

		newsChannel.setNews("Breaking News: Observer Pattern Implemented in Java!");

		newsChannel.detach(smsSubscriber); // remove sms subscriber 
		newsChannel.setNews("Update: Observer Pattern Example is Complete.");

	}
}

/*
 * The Observer Pattern is used to define a one-to-many dependency between
 * objects, so that when one object (the subject) changes state, all its
 * dependents (observers) are notified and updated automatically. This pattern
 * is particularly useful for implementing distributed event-handling systems,
 * where a change in one part of the system needs to be reflected in many other
 * parts.
 * 
 * Structure: Subject: Maintains a list of observers and provides methods to
 * attach or detach observers. It also notifies all registered observers
 * whenever there is a change in its state. Observer Interface: Defines an
 * update() method that all observers must implement. Concrete Observers:
 * Implement the Observer interface to receive updates from the subject.
 * Concrete Subject: Stores the state of interest to the observers and notifies
 * them of changes.
 * 
 * Use Cases 
 * News Subscription Services: Scenario: A news service that sends
 * updates to subscribers via different channels (e.g., email, SMS). Solution:
 * Use the Observer Pattern to notify all subscribers when a new article is
 * published.
 * 
 * GUI Event Handling: Scenario: In a GUI application, when a button is clicked,
 * multiple components might need to respond to the event (e.g., updating a
 * display, saving data, etc.). Solution: Use the Observer Pattern to allow
 * multiple listeners to respond to the event without the button needing to know
 * about all the listeners.
 * 
 * Stock Market Tickers: Scenario: A stock market application where multiple
 * clients (traders, analysts) need to be notified when stock prices change.
 * Solution: Use the Observer Pattern to allow these clients to receive
 * real-time updates whenever the stock price changes.
 * 
 * Social Media Notifications: Scenario: A social media platform where users can
 * follow others and receive notifications when they post updates. Solution: Use
 * the Observer Pattern to notify followers of any new posts by the users they
 * follow.
 * 
 */

package com.designpattern.observer.newschannelsubscribers;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private String latestMessage;
	
	/**
	 * This method will add the news
	 * @param news: news to broadcast
	 */
	public void setNews(String news) {
		this.latestMessage = news;
		notifyObservers();
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	/**
	 * This method will notify all subscriber.
	 */
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(latestMessage);
		}
	}

}

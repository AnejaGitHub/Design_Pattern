package com.designpattern.singleton.emailbody;


public class SingletonEmail {
	
	private static StringBuilder body = null;
	
	private SingletonEmail() {		
	}
	
	public static StringBuilder getInstance() {
		if(body == null) {
			body = new StringBuilder();
		}
		return body;
	}
	
	public static StringBuilder getThreadSafeInstance() {
		if(body == null) {
			synchronized(SingletonEmail.class) {
				if(body == null) {
					body = new StringBuilder();
				}
			}
		}
		return body;
	}
}

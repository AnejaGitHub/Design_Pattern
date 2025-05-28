package com.designpattern.factorymethod.ui;


//Concrete Product 2: MacOS Button
public class MacOsButton implements Button {

	@Override
	public void render() {
		System.out.println("rendering MacOS Button");
	}

}

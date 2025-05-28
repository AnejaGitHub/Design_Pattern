package com.designpattern.factorymethod.ui;


//Concrete Product 1: Windows Button
public class WindowsButton implements Button {

	@Override
	public void render() {
		System.out.println("rendering Windows button");
	}

}

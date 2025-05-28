package com.designpattern.factorymethod.ui;


//Creator Class
public abstract class Dialog {
	
	//Factory method
	abstract Button createButton();
	
	// Method that uses the product created by the factory method
	public void renderDialog() {
		// Create the button using the factory method
		Button button = createButton();
		button.render();
	}

}

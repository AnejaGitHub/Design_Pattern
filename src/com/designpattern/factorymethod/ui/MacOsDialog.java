package com.designpattern.factorymethod.ui;

//Concrete Creator 2: MacOS Dialog
public class MacOsDialog extends Dialog {

	@Override
	Button createButton() {
		return new MacOsButton();
	}

	

}

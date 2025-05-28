package com.designpattern.factorymethod.ui;


//Concrete Creator 1: Windows Dialog
public class WindowsDialog extends Dialog {

	@Override
	Button createButton() {
		return new WindowsButton();
	}

}

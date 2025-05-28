package com.designpattern.factorymethod.ui;


//Usage in a client class
public class FactoryGUIFramework {

	public static void main(String[] args) {
		Dialog dialog;
		
		String os = System.getProperty("os.name").toLowerCase(); // system OS
//		os = "win"; //change OS type then button will be rendered which is compatible with the OS
		if(os.contains("win")) {
			dialog = new WindowsDialog();
		} else if(os.contains("mac")) {
			dialog = new MacOsDialog();
		} else {
			throw new UnsupportedOperationException("Unsupported Operating System: " + os);
		}
		
		dialog.renderDialog();
	}	
}
/*
 Purpose:
The Factory Method Pattern defines an interface for creating an object but allows subclasses to alter 
the type of objects that will be created. This pattern is particularly useful when the exact type of 
the object needs to be determined at runtime.

Structure:
Product Interface/Abstract Class: Defines the interface for objects the factory method creates.
Concrete Product Classes: Implement the product interface.
Creator Class (Abstract or Interface): Declares the factory method, which returns an object of type Product.
Concrete Creator Classes: Override the factory method to return an instance of a concrete product.

Use Cases
1.GUI Frameworks
Scenario: In GUI frameworks, there might be a need to create different UI components (buttons, text fields, etc.) 
based on the user's platform (Windows, Mac, etc.).
Solution: Use the Factory Method pattern to create platform-specific components, where each concrete 
factory creates components for a specific platform.

2.Document Management Systems:
Scenario: A document management system might need to handle different document types (Word, PDF, Excel). 
The exact type might be determined at runtime.
Solution: Implement a factory method that creates the appropriate document type based on input, ensuring that 
the system can handle various document types seamlessly.

3.Game Development:
Scenario: In games, different levels might have different types of enemies. You need to create enemies 
based on the level or difficulty.
Solution: Use the Factory Method to create enemy objects tailored to each level, allowing for more 
flexible and scalable game design.

4.Database Drivers:
Scenario: An application might need to connect to different databases (e.g., MySQL, Oracle) depending on 
the configuration or environment.
Solution: Implement a factory method to create database connection objects specific to the database type, 
enabling easier switching between databases.
 
*/
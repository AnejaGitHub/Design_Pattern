package com.designpattern.builder.sqlquery;

public class BuilderMain {
	public static void main(String[] args) {
		// Building a SQL query using the Builder pattern
		SQLQuery query = new SQLQuery.QueryBuilder().from("employees").select("name, position, salary")
				.where("salary > 50000").orderBy("salary DESC").limit("10").build();

		System.out.println(query);
	}

}

/*
 * Purpose: The Builder Pattern is used to construct a complex object step by
 * step. It separates the construction of a complex object from its
 * representation, allowing the same construction process to create different
 * representations. This pattern is particularly useful when the object creation
 * process involves many optional parameters or when the order of object
 * creation steps must be controlled.
 * 
 * Structure: Product: The complex object that is being built. Builder
 * Interface: Defines the steps to build the product. Concrete Builder:
 * Implements the steps defined in the Builder interface. Director: (Optional)
 * Oversees the construction process using a builder instance. Client: Uses the
 * Builder to construct the complex object.
 * 
 * 
 * Use Cases 
 * 1.Building Complex UI Components:
 * Scenario: Constructing a complex UI component (like a dialog box) with many
 * optional elements (buttons, text fields, labels, etc.). Solution: Use the
 * Builder Pattern to incrementally build the UI component, allowing the client
 * to specify only the elements it needs. 
 * 
 * 2.Constructing SQL Queries:
 * Scenario: Building SQL queries dynamically based on user input or program
 * logic, where different parts of the query are optional. Solution: Use a
 * builder to construct the query incrementally, allowing for flexible and
 * readable query creation. 
 * 
 * 3.Creating Configurable Products: 
 * Scenario: In software for product configuration (e.g., a car configurator),
 * the product has many optional features. Solution: The Builder Pattern allows
 * users to incrementally select features (like engine type, color, etc.) and
 * build the final product. 
 * 
 * 4.Assembling Game Characters: 
 * Scenario: In game development, a character might be composed of various
 * optional features (weapons, armor, abilities, etc.). Solution: Use the
 * Builder Pattern to allow players to customize their characters step by step.
 */

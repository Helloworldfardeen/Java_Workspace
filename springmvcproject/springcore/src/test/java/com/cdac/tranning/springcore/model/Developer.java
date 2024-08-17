package com.cdac.tranning.springcore.model;

//pojo class with dependent class of address --- loosely couple class
public class Developer {
	private int id;
	private String name;
	Address address; // has a relationship...because we defining user define datatype

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/*
	 * address in this context is an instance variable that holds an object of type
	 * Address, representing the developer's address.
	 */
//  loosely couple class we can implement inside the develop with create address object we dont because we want 
//  loosely couple class ...
	public void display() {
		System.out.println("ID      ::" + id);
		System.out.println("Name    ::" + name);
		System.out.println("::" + address.toString());
	}
}

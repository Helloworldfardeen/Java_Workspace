package com.cdac.tranning.springcore.model;

public class Author {
String name;
Address address;
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


@Override
public String toString() {
	return "Author [name=" + name + ", address=" + address + "]";
}
}
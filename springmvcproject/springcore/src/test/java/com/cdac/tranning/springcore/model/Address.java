package com.cdac.tranning.springcore.model;

public class Address {
	// this is equivalent to normalization..
	String adressline1, city, state, country;

	public String getAdressline1() {
		return adressline1;
	}

	public void setAdressline1(String adressline1) {
		this.adressline1 = adressline1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [adressline1=" + adressline1 + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}

}

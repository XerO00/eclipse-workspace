package org.koushik.javabrains.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(name="USER_HOME_CITY")
	private String City;
	
	@Column(name="USER_HOME_STATE")
	private String State;
	
	public String getCity() {
		System.out.println("getCity() ");
		return City;
	}
	public void setCity(String city) {
		System.out.println("setCity() ");
		City = city;
	}
	public String getState() {
		System.out.println("getState() ");
		return State;
	}
	public void setState(String state) {
		System.out.println("setState() ");
		State = state;
	}
	
}

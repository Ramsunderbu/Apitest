package org.json;

import java.util.ArrayList;

public class Root {
	
	private String name;
	 private float age;
	 private boolean marriedstatus;
	private Address AddressObject;
	 ArrayList < Long > phone = new ArrayList < Long > ();


	 // Getter Methods 

	 public Root(String name, float age, boolean marriedstatus, Address addressObject, ArrayList<Long> phone) {
		super();
		this.name = name;
		this.age = age;
		this.marriedstatus = marriedstatus;
		AddressObject = addressObject;
		this.phone = phone;
	}

	public String getName() {
	  return name;
	 }

	 public float getAge() {
	  return age;
	 }

	 public boolean getMarriedstatus() {
	  return marriedstatus;
	 }

	 public Address getAddress() {
	  return AddressObject;
	 }

	 // Setter Methods 

	 public Address getAddressObject() {
		return AddressObject;
	}

	public void setAddressObject(Address addressObject) {
		AddressObject = addressObject;
	}

	public ArrayList<Long> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<Long> phone) {
		this.phone = phone;
	}

	public void setName(String name) {
	  this.name = name;
	 }

	 public void setAge(int age) {
	  this.age = age;
	 }

	 public void setMarriedstatus(boolean marriedstatus) {
	  this.marriedstatus = marriedstatus;
	 }

	 public void setAddress(Address addressObject) {
	  this.AddressObject = addressObject;
	 }
		

}

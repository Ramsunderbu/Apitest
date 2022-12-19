package org.json;

public class Address {
	 private String street;
	 private String district;


	 // Getter Methods 

	 public Address(String street, String district) {
		super();
		this.street = street;
		this.district = district;
	}

	public String getStreet() {
	  return street;
	 }

	 public String getDistrict() {
	  return district;
	 }

	 // Setter Methods 

	 public void setStreet(String street) {
	  this.street = street;
	 }

	 public void setDistrict(String district) {
	  this.district = district;
	 }
	

}

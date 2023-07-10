package com.techhub.springbootdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address", schema = "TEST_DB")
public class Address {

	@Id
	@Column(name = "ADDRESS_ID", nullable = false)
	private String addressId;

	@Column(name = "CITY_VILLAGE", nullable = false)
	private String city_village;

	@Column(name = "TEHSIL", nullable = false)
	private String tehsil;

	@Column(name = "DISTRICT", nullable = false)
	private String district;

	@Column(name = "STATE", nullable = false)
	private String state;

	@Column(name = "PIN_CODE", nullable = false)
	private int pinCode;
	
	@OneToOne
	@JoinColumn(name = "USER_ADDRESS_ID")
	private User user;

	public Address() {
	}

	public Address(String addressId, String city_village, String tehsil, String district, String state, int pinCode) {
		super();
		this.addressId = addressId;
		this.city_village = city_village;
		this.tehsil = tehsil;
		this.district = district;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getCity_village() {
		return city_village;
	}

	public void setCity_village(String city_village) {
		this.city_village = city_village;
	}

	public String getTehsil() {
		return tehsil;
	}

	public void setTehsil(String tehsil) {
		this.tehsil = tehsil;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city_village=" + city_village + ", tehsil=" + tehsil
				+ ", district=" + district + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
}

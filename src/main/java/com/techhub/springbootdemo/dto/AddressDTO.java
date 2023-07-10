package com.techhub.springbootdemo.dto;

public class AddressDTO {

	private String addressId;
	private String city_village;
	private String tehsil;
	private String district;
	private String state;
	private int pinCode;

	public AddressDTO() {
	}

	public AddressDTO(String addressId, String city_village, String tehsil, String district, String state, int pinCode) {
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

package com.techhub.springbootdemo.dto;

import java.util.List;

/**
 * The UserDTO
 * 
 * @author ramniwash
 */
public class UserDTO {

	private String userid;
	private String username;
	private String password;
	private String emailId;
	private String mobileNumber;
	private String country;
	private String city;
	private List<AddressDTO> addresses;

	public UserDTO() {
	}

	public UserDTO(String userid, String username, String password, String emailId, String mobileNumber, String country,
			String city) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.country = country;
		this.city = city;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<AddressDTO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressDTO> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", username=" + username + ", password=" + password + ", emailId="
				+ emailId + ", mobileNumber=" + mobileNumber + ", country=" + country + ", city=" + city + "]";
	}
}

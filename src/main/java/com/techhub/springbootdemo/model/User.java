package com.techhub.springbootdemo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The UserDTO
 * 
 * @author ramniwash
 */
@Entity
@Table(name = "users", schema = "TEST_DB")
public class User {

	@Id
	@Column(name = "USER_ID", length = 20)
	private String userid;

	@Column(name = "USERNAME", length = 30)
	private String username;

	@Column(name = "PASSWORD", length = 20)
	private String password;

	@Column(name = "EMAIL", length = 30)
	private String emailId;

	@Column(name = "MOBILE_NUMBER", length = 10)
	private String mobileNumber;

	@Column(name = "COUNTRY", length = 20)
	private String country;

	@Column(name = "CITY", length = 20)
	private String city;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ADDRESS_ID")
	private List<Address> addresses;

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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", country=" + country + ", city=" + city + "]";
	}
}
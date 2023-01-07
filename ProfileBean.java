/*
 *
 * File Name         : ProfileBean
 *
 * Short Description : This file is used to get/set Profile Details.
 *
 * Version Number    : 1.0
 *
 *
 */

package com.wipor.bean;

import java.util.Date;

/**
 * This class is used to get/set registration details.
 *
 * @author 
 * @version 1.0,May 5,2015
 * @since 1.0
 */

public class ProfileBean {

	private String userID;

	private String firstName;

	private String lastName;

	private String DateOfBirth;

	private String gender;

	private String street;

	private String location;

	private String city;

	private String state;

	private String pincode;

	private String mobileNo;

	private String emailID;

	private String Password;

	private String ConfirmPassword;

	/**
	 * 
	 * @return userID
	 * 
	 */
	
	
	public String getUserID() {
		return userID;
	}



	public ProfileBean(String firstName, String lastName, String dob, String gender, String street,
			String location, String city, String state, String pincode, String mobileNo, String emailID,
			String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBirth = dob;
		this.gender = gender;
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.emailID = emailID;
		Password = password;
	}



	/**
	 * 
	 * @param userID is set
	 */
	public void setUserID(final String userID) {
		this.userID = userID;
	}

	/**
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param firstName is set
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName is set
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return dateOfBirth
	 */
	public String getDateOfBirth() {
		return DateOfBirth;
	}

	/**
	 * 
	 * @param dateOfBirth is set
	 */
	public void setDateOfBirth(final String dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}

	/**
	 * 
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * 
	 * @param gender is set
	 */
	public void setGender(final String gender) {
		this.gender = gender;
	}

	/**
	 * 
	 * @return street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * 
	 * @param street is set
	 */
	public void setStreet(final String street) {
		this.street = street;
	}

	/**
	 * 
	 * @return location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * 
	 * @param location is set
	 */
	public void setLocation(final String location) {
		this.location = location;
	}

	/**
	 * 
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @param city is set
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/**
	 * 
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state is set
	 */
	public void setState(final String state) {
		this.state = state;
	}

	/**
	 * 
	 * @return Pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * 
	 * @param pincode is set
	 */
	public void setPincode(final String pincode) {
		this.pincode = pincode;
	}

	/**
	 * 
	 * @return mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * 
	 * @param mobileNo is set
	 */
	public void setMobileNo(final String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * 
	 * @return emailID
	 */
	public String getEmailID() {
		return emailID;
	}

	/**
	 * 
	 * @param emailID is set
	 */
	public void setEmailID(final String emailID) {
		this.emailID = emailID;
	}

	/**
	 * @return password
	 */

	public String getPassword() {
		return Password;
	}

	/**
	 * @param password
	 */
	public void setPassword(final String password) {
		Password = password;
	}
}

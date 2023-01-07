/* 
 *
 * File Name         : PassengerBean.java
 *
 * Short Description : This file is used to get/set passenger Details.
 *
 * Version Number    : 1.0 

 *
 */
package com.wipor.bean;




/**
 * This class is used to get/set login details.
 *
 * @author 
 * @version 1.0,May 5,2015
 * @since 1.0
 */

public class PassengerBean {
	
	private int reservationID;
	
	private int scheduleID;
	
	private String name;
	
	private int age;
	
	private String gender;
	/**
	 * @return the reservationID
	 */
	public int getReservationID() {
		return reservationID;
	}
	/**
	 * @param reservationID the reservationID to set
	 */
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}
	/**
	 * @return the scheduleID
	 */
	public int getScheduleID() {
		return scheduleID;
	}
	/**
	 * @param scheduleID the scheduleID to set
	 */
	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}

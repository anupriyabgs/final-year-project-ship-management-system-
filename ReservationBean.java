/* 
 *
 * File Name         : ReservationBean
 *
 * Short Description : This file is used to get/set Reservation Details.
 *
 * Version Number    : 1.0 
 *
 
 *
 */

package com.wipor.bean;

import java.util.Date;



/**
 *This class is used to get/set reservation details.
 * @author 
 * @version 1.0,May 5,2015
 * @since 1.0
 */

public class ReservationBean {
	
	private String reservationID;
	
	private String scheduleID;
	
	private String userID;
	
	private Date bookingDate;
	
	private Date journeyDate;
	
	private int noOfSeats;
	
	private double totalFare;
	
	private String bookingStatus;
	

	
	/**
	 * 
	 * @return reservationID
	 */
	public String getReservationID() {
		return reservationID;
	}


	/**
	 * 
	 * @param reservationID is set
	 */
	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}
   
	/**
	 * 
	 * @return scheduleID
	 */
	public String getScheduleID() {
		return scheduleID;
	}
	
	

	/**
	 * 
	 * @param scheduleID is set
	 */
	public void setScheduleID(String scheduleID) {
		this.scheduleID = scheduleID;
	}

	
	/**
	 * 
	 * @return userID
	 */
	public String getUserID() {
		return userID;
	}

	
	/**
	 * 
	 * @param userID is set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * 
	 * @return bookingDate
	 */
	
	public Date getBookingDate() {
		return bookingDate;
	}

	
	/**
	 * 
	 * @param bookingDate is set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	
	/**
	 * 
	 * @return journeyDate
	 */
	public Date getJourneyDate() {
		return journeyDate;
	}


	/**
	 * 
	 * @param journeyDate is set
	 */
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	/**
	 * 
	 * @return noOfSeats
	 */
	
	public int getNoOfSeats() {
		return noOfSeats;
	}

	
	/**
	 * 
	 * @param noOfSeats is set
	 */
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	
	/**
	 * 
	 * @return totalFare
	 */
	public double getTotalFare() {
		return totalFare;
	}

	
	/**
	 * 
	 * @param totalFare is set
	 */
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	
	/**
	 * 
	 * @return bookingStatus
	 */
	public String getBookingStatus() {
		return bookingStatus;
	}

	
	/**
	 * 
	 * @param bookingStatus is set
	 */
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


}

/* 
 *
 * File Name         : ShipBean
 *
 * Short Description : This file is used to get/set Ship Details.
 *
 * Version Number    : 1.0 
 *
 */

package com.wipor.bean;

/**
*This class is used to get/set ship details.
 * @author 
 * @version 1.0,May 5,2015
 * @since 1.0
 */

public class ShipBean {
	
	private int shipID;
	private String shipName;
	private int seatingCapacity;
	private int reservationCapacity;
	

public ShipBean(){
	
}
	public ShipBean(String shipName, int seatingcap, int recap) {
		super();
		this.shipName = shipName;
		this.seatingCapacity = seatingcap;
		this.reservationCapacity = recap;
	}


	/**
	 * 
	 * @return shipID
	 */
	public int getShipID() {
		return shipID;
	}

	
	/**
	 * 
	 * @param i is set
	 */
	public void setShipID(int i) {
		this.shipID = i;
	}

	/**
	 * 
	 * @return shipName
	 */
	
	public String getShipName() {
		return shipName;
	}

	/**
	 * 
	 * @param shipName is set
	 */
	
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	
	/**
	 * 
	 * @return seatingCapacity
	 */
	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	
	/**
	 * 
	 * @param seatingCapacity is set
	 */
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	/**
	 * 
	 * @return reservationCapacity
	 */
	
	public int getReservationCapacity() {
		return reservationCapacity;
	}
	
	

	/**
	 * 
	 * @param reservationCapacity is set
	 */
	public void setReservationCapacity(int reservationCapacity) {
		this.reservationCapacity = reservationCapacity;
	}
		
}

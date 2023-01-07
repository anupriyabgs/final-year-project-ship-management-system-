/* 
 *
 * File Name         : RouteBean.java
 *
 * Short Description : This file is used to get/set route Details.
 *
 * Version Number    : 1.0 
 *
 
 *
 */
package com.wipor.bean;


/**
 *This class is used to get/set route details.
 * @author 
 * @version 1.0,May 5,2015
 * @since 1.0
 */

public class RouteBean {

    private String routeID;

     private String source;
	
	private String destination;
	
	private String travelDuration;

	private double fare;

	/**
	 * @return the routeID
	 */
	public String getRouteID() {
		return routeID;
	}

	/**
	 * @param routeID the routeID to set
	 */
	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the travelDuration
	 */
	public String getTravelDuration() {
		return travelDuration;
	}

	/**
	 * @param travelDuration the travelDuration to set
	 */
	public void setTravelDuration(String travelDuration) {
		this.travelDuration = travelDuration;
	}

	/**
	 * @return the fare
	 */
	public double getFare() {
		return fare;
	}

	/**
	 * @param fare the fare to set
	 */
	public void setFare(double fare) {
		this.fare = fare;
	}
	
	
	
}

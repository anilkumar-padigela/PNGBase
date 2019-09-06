/**
 * 
 */
package com.png.ui.model;

/**
 * @author Padigela Anil kumar
 *
 */
public class Location {

	/**
	 * 
	 */
	public Location() {
		// TODO Auto-generated constructor stub
	}
	
	private String locationId;
	private String locationName;
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + "]";
	}

}

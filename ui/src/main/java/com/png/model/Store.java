/**
 * 
 */
package com.png.ui.model;

/**
 * @author Padigela Anil kumar
 *
 */
public class Store {

	/**
	 * 
	 */
	public Store() {
		// TODO Auto-generated constructor stub
	}

	
	private String  storeId;
	private String storeName;
	private String description;
	private String locationId;
	private String storeTypeId;
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getStoreTypeId() {
		return storeTypeId;
	}
	public void setStoreTypeId(String storeTypeId) {
		this.storeTypeId = storeTypeId;
	}
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", description=" + description
				+ ", locationId=" + locationId + ", storeTypeId=" + storeTypeId + "]";
	}
	
	
	
}

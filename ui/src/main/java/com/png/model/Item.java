/**
 * 
 */
package com.png.ui.model;

/**
 * @author Padigela Anil kumar
 *
 */
public class Item {

	/**
	 * 
	 */
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	private String item_id;
	private String itemName;
	private String itemDesc;
	private String price;
	private String quantity;
	private String storeId;
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", price=" + price
				+ ", quantity=" + quantity + ", storeId=" + storeId + "]";
	}
	
	
	
	
	

}

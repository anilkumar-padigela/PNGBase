/**
 * 
 */
package com.png.ui.model;

import java.util.List;

/**
 * @author Padigela Anil kumar
 *
 */
public class OrderDetails {

	/**
	 * 
	 */
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}
	
	private String orderId;
	private List<Item> itemList;
	private double billAmount;
	private String orderStatus;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
	

}

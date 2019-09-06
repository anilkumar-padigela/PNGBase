/**
 * 
 */
package com.png.ui.model;

import java.util.List;

/**
 * @author Padigela Anil kumar
 *
 */
public class BillingDetails {

	/**
	 * 
	 */
	public BillingDetails() {
		// TODO Auto-generated constructor stub
	}

	
	private String refNo;
	private List<OrderDetails> orderList;
	private double billAmount;
	private String billStatus;
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public List<OrderDetails> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<OrderDetails> orderList) {
		this.orderList = orderList;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	
	
	
	
	
}

/**
 * 
 */
package com.png.product.model;

/**
 * @author Padigela Anil kumar
 *
 */
public class ProductModel {

	/**
	 * 
	 */
	public ProductModel() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductModel(String productName, String productId, String storeId) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.storeId = storeId;
	}

	private String productName;
	private String productId;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	private String storeId;
	
	

}

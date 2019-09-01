/**
 * 
 */
package com.png.store.model;

/**
 * @author Padigela Anil kumar
 *
 */
public class StoreModel {

	/**
	 * 
	 */
	public StoreModel() {
		// TODO Auto-generated constructor stub
	}
	
	public StoreModel(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	private String name;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}

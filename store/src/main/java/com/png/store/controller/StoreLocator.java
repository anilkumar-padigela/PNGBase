/**
 * 
 */
package com.png.store.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.png.store.model.StoreModel;

/**
 * @author Padigela Anil kumar
 *
 */

@RestController
@RequestMapping("/rest/store")
public class StoreLocator {

	/**
	 * 
	 */
	public StoreLocator() {
		// TODO Auto-generated constructor stub
	}

	
	@Autowired
    RestTemplate restTemplate;
	
	@GetMapping("/{location}")
	public List<StoreModel> getStores(@PathVariable("location") final String location){
		
		StoreModel store1 = new StoreModel("SPAR", "1");
		List<StoreModel> storeList = new ArrayList<StoreModel>();
		storeList.add(store1);		
		return storeList;
		
	}
	

}

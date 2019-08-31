/**
 * 
 */
package com.png.product.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.png.product.model.ProductModel;

/**
 * @author Padigela Anil kumar
 *
 */
@RestController
@RequestMapping("/rest/product")
public class ProductController {

	/**
	 * 
	 */
	public ProductController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping("/getProducts")
	public List<ProductModel> getProducts(@PathVariable("location") final String location){
		
		ProductModel product1 = new ProductModel("Dress", "1", "1");
		List<ProductModel> productsList = new ArrayList<ProductModel>();
		productsList.add(product1);		
		return productsList;
		
	}

}

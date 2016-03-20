/**
 * 
 */
package org.open.application.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.open.application.databean.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author SandeepRaju
 *
 */
@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	private static List<Product> productList = new ArrayList<Product>();
	
	static  {
		productList.add(new Product(100, "MicroMax Juice 3", 7900.0, Calendar.getInstance()));
		productList.add(new Product(101, "iPhone 6s", 69000.0, Calendar.getInstance()));
		productList.add(new Product(102, "Galaxy 7Edge", 59000.0, Calendar.getInstance()));
		productList.add(new Product(103, "Coolpad Lite3", 6900.0, Calendar.getInstance()));
		productList.add(new Product(104, "Redmi Note2", 7900.0, Calendar.getInstance()));
		productList.add(new Product(105, "Honor 4x", 9900.0, Calendar.getInstance()));
		productList.add(new Product(106, "Lumina 560", 11900.0, Calendar.getInstance()));
		productList.add(new Product(107, "Moto Turbo", 31900.0, Calendar.getInstance()));
	}
	
	@RequestMapping(value = "/products/all", method = RequestMethod.GET)
	public List<Product> getAllProducts() {
		return productList;
	}
	
	@RequestMapping(value = "/product/{index}", method = RequestMethod.GET)
	public Product getProductByIndex(@PathVariable int index) {
		return productList.get(index);
	}

}

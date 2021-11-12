/**
 * 
 */
package com.jpmc.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpmc.bean.Customer;

/**
 * @author Administrator
 *
 */

@RestController
public class CustomerController {

  @GetMapping("/customersold")
  public String getCustomers() {
	  
	  System.out.println("Cutomers Rest API");
	  return "My Hello Rest";
  }
  
  @RequestMapping(produces = MediaType.APPLICATION_JSON,
		  method = RequestMethod.GET,
		  value = "/details")
  @ResponseBody
  public Customer details() {
	  Customer c1=new Customer();
		/* c1.setId(21);
		c1.setName("Amit");
		c1.setAddress("Noida");
		*/
		
		return c1;
  }
  
}

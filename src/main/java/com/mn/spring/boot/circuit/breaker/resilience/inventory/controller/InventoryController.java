package com.mn.spring.boot.circuit.breaker.resilience.inventory.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mn.spring.boot.circuit.breaker.resilience.inventory.domain.Inventory;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	
	@PostMapping("/check")
	public Boolean checkInventory(@RequestBody Inventory inventory) {
		System.out.println("Inside checkInventory, for product "+inventory.getProductName());
		if(inventory.getProductName().equalsIgnoreCase("Soap")) {
			return Boolean.TRUE;
		}else if(inventory.getProductName().equalsIgnoreCase("Fruits")) {
			return Boolean.FALSE;
		}
		return Boolean.FALSE;
	}
}

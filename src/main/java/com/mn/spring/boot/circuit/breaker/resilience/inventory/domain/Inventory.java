package com.mn.spring.boot.circuit.breaker.resilience.inventory.domain;

import lombok.Data;

@Data
public class Inventory {
	private String productName;
	private int unit;
}

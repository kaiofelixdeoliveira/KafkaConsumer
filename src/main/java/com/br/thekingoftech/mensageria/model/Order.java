package com.br.thekingoftech.mensageria.model;


import java.io.Serializable;
import java.math.BigDecimal;

public class Order implements Serializable {

	private String identifier;
	private String customer;
	private BigDecimal value;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}

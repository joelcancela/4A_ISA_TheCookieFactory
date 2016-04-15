package fr.unice.polytech.isa.tcf.exceptions;


import java.io.Serializable;

public class EmptyCartException extends Exception implements Serializable {

	private String name;
	private double amount;

	public EmptyCartException(String customerName, double amount) {
		this.name = customerName;
		this.amount = amount;
	}

	public EmptyCartException() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}

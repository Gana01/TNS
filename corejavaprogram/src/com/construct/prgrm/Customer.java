package com.construct.prgrm;

public class Customer {
	private String customer_name;
	private int customer_id;
	private String customer_address;
	public Customer(String customer_name, int customer_id, String customer_address) {
		super();
		this.customer_name = customer_name;
		this.customer_id = customer_id;
		this.customer_address = customer_address;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	@Override
	public String toString() {
		return "Customer [customer_name=" + customer_name + ", customer_id=" + customer_id + ", customer_address="
				+ customer_address + "]";
	}


}

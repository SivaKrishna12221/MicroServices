package com.nt.model;

import java.util.Arrays;

public class BillInfo {

	private Integer billId;
	private String custName;
	@Override
	public String toString() {
		return "BillInfo [billId=" + billId + ", custName=" + custName + ", products=" + Arrays.toString(products)
				+ ", amount=" + amount + "]";
	}
	public BillInfo(Integer billId, String custName, String[] products, Double amount) {
		super();
		this.billId = billId;
		this.custName = custName;
		this.products = products;
		this.amount = amount;
	}
	private String[] products;
	private Double amount;
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String[] getProducts() {
		return products;
	}
	public void setProducts(String[] products) {
		this.products = products;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
}

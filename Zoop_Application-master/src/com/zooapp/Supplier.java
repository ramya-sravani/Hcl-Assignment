package com.zooapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUPPLIER")
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SUPPLIER_ID")
	private int supplierId;
	
	@Column(name = "SUPPLIER_NAME")
	private String supplierName;
	
	@Column(name = "CONTACT_NO")
	private String contactNo;
	
	@Column(name = "ADDRESS")
	private String address;

	public Supplier(String supplierName, String contactNo, String address) {
		super();
		this.supplierName = supplierName;
		this.contactNo = contactNo;
		this.address = address;
	}

	public Supplier() {
		super();
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Supplier [supplierId=");
		builder.append(supplierId);
		builder.append(", supplierName=");
		builder.append(supplierName);
		builder.append(", contactNo=");
		builder.append(contactNo);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
}

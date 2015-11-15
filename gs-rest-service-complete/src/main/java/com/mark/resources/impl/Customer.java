package com.mark.resources.impl;

import com.mark.resources.inf.IDAccessor;

public class Customer implements IDAccessor {
	private String name; // customer name
	private String address; // customer address
	private String telephoneNumber; // customer telephone number
	private long id;

	public Customer(String name, String address, String telephoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
	}

	public Customer(long id, String name, String address, String telephoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.id = id;
	}

	/**
	 * get customer name
	 * 
	 * @return customer name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set customer name
	 * 
	 * @param name
	 *            customer name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get customer address
	 * 
	 * @return customer address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * set customer address
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * get customer telephone number
	 * 
	 * @return customer telephone number
	 */
	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * set customer telephone number
	 * 
	 * @param telephoneNumber
	 */
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	/**
	 * set customer id
	 * 
	 * @param id
	 */
	@Override
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * get customer id
	 * 
	 * @return
	 */
	@Override
	public long getId() {
		return id;
	}

}

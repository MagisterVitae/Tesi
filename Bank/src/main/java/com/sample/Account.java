package com.sample;

import java.util.Date;
import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	
	long uuid;
	long number;
	String name;
	long balance;
	double currency;
	Date startDate;
	Date endDate;
	String type;
	double interestRate;
	String status;
	Customer owner;
	
	public Account(long uuid, long number, String name, long balance,
			double currency, Date startDate, Date endDate, String type,
			double interestRate, String status) {
		super();
		this.uuid = uuid;
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.currency = currency;
		this.startDate = startDate;
		this.endDate = endDate;
		this.type = type;
		this.interestRate = interestRate;
		this.status = status;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public long getUuid() {
		return uuid;
	}

	public void setUuid(long uuid) {
		this.uuid = uuid;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (balance ^ (balance >>> 32));
		long temp;
		temp = Double.doubleToLongBits(currency);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		temp = Double.doubleToLongBits(interestRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (number ^ (number >>> 32));
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result
				+ ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + (int) (uuid ^ (uuid >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (balance != other.balance)
			return false;
		if (Double.doubleToLongBits(currency) != Double
				.doubleToLongBits(other.currency))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (Double.doubleToLongBits(interestRate) != Double
				.doubleToLongBits(other.interestRate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (uuid != other.uuid)
			return false;
		return true;
	}

	public double getCurrency() {
		return currency;
	}

	public void setCurrency(double currency) {
		this.currency = currency;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}
	
	
}

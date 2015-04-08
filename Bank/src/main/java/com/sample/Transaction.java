package com.sample;

import java.util.Date;

public class Transaction {

	long uuid;
	Account accountFrom;
	Account accountTo;
	String status;
	long amount;
	String description;
	double currency;
	Date date;
	
	public Transaction(long uuid, Account accountFrom, Account accountTo,
			String status, long amount, String description, double currency,
			Date date) {
		super();
		this.uuid = uuid;
		this.accountFrom = accountFrom;
		this.accountTo = accountTo;
		this.status = status;
		this.amount = amount;
		this.description = description;
		this.currency = currency;
		this.date = date;
	}

	public long getUuid() {
		return uuid;
	}

	public void setUuid(long uuid) {
		this.uuid = uuid;
	}

	public Account getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(Account accountFrom) {
		this.accountFrom = accountFrom;
	}

	public Account getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(Account accountTo) {
		this.accountTo = accountTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCurrency() {
		return currency;
	}

	public void setCurrency(double currency) {
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountFrom == null) ? 0 : accountFrom.hashCode());
		result = prime * result
				+ ((accountTo == null) ? 0 : accountTo.hashCode());
		result = prime * result + (int) (amount ^ (amount >>> 32));
		long temp;
		temp = Double.doubleToLongBits(currency);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Transaction other = (Transaction) obj;
		if (accountFrom == null) {
			if (other.accountFrom != null)
				return false;
		} else if (!accountFrom.equals(other.accountFrom))
			return false;
		if (accountTo == null) {
			if (other.accountTo != null)
				return false;
		} else if (!accountTo.equals(other.accountTo))
			return false;
		if (amount != other.amount)
			return false;
		if (Double.doubleToLongBits(currency) != Double
				.doubleToLongBits(other.currency))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (uuid != other.uuid)
			return false;
		return true;
	}
	
	
}

package com.sample;

public class Address {

	long uuid;
	String addressLine1;
	String addressLine2;
	int postCode;
	String city;
	String country;
	
	public Address(long uuid, String addressLine1, String addressLine2,
			int postCode, String city, String country) {
		super();
		this.uuid = uuid;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.postCode = postCode;
		this.city = city;
		this.country = country;
	}

	public long getUuid() {
		return uuid;
	}

	public void setUuid(long uuid) {
		this.uuid = uuid;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((addressLine1 == null) ? 0 : addressLine1.hashCode());
		result = prime * result
				+ ((addressLine2 == null) ? 0 : addressLine2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + postCode;
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
		Address other = (Address) obj;
		if (addressLine1 == null) {
			if (other.addressLine1 != null)
				return false;
		} else if (!addressLine1.equals(other.addressLine1))
			return false;
		if (addressLine2 == null) {
			if (other.addressLine2 != null)
				return false;
		} else if (!addressLine2.equals(other.addressLine2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (postCode != other.postCode)
			return false;
		if (uuid != other.uuid)
			return false;
		return true;
	}
	
	
}

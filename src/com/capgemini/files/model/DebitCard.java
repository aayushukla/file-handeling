package com.capgemini.files.model;

import java.io.Serializable;

public class DebitCard {
	private long cardNumber;
	private int cvv;
	private int expiryMonth;
	private int expiryYear;
	public DebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DebitCard(long cardNumber, int cvv, int expiryMonth, int expiryYear) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cardNumber ^ (cardNumber >>> 32));
		result = prime * result + cvv;
		result = prime * result + expiryMonth;
		result = prime * result + expiryYear;
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
		DebitCard other = (DebitCard) obj;
		if (cardNumber != other.cardNumber)
			return false;
		if (cvv != other.cvv)
			return false;
		if (expiryMonth != other.expiryMonth)
			return false;
		if (expiryYear != other.expiryYear)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DebitCard [cardNumber=" + cardNumber + ", cvv=" + cvv + ", expiryMonth=" + expiryMonth + ", expiryYear="
				+ expiryYear + "]";
	}
	
}

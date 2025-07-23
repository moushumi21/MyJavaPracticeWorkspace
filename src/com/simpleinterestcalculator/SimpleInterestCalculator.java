package com.simpleinterestcalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalAmount = principal
				.add((principal).multiply(interest.divide(new BigDecimal(100))).multiply(new BigDecimal(noOfYears)));
		return totalAmount;
	}
}

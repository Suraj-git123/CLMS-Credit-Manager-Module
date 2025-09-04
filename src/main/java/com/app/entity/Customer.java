package com.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private Integer customerId;
	private String customerName;
	private Long customerContactNumber;
	private String customerEmailId;
	private LoanEnquiry le;
	
}

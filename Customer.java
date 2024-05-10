package com.javaOOPS;

public class Customer {
	
	// fields declare customerId,customerName,customerAddress,customerMailId,customerContractNo. 
    // it is inislization of variable 
	
	private int customerId;     // private is used for access modifier
	private String customerName;
	private String customerAddress;
	private String customerMailId;
	private long customerContractNo;
	
	
	// Constructor        // Constructor name must should have same name of the className but not a different name
	public Customer()    // default parameter/Zero-parameterized constructor  // parameterized  default value is null 
	{
		
		customerId = 101;
		customerName = "vaibhav";
		customerAddress = "pune";
		customerMailId = "vaibhav@gmail.com";
		customerContractNo = 2457229458L;
		
	}

	public Customer(int customerId, String customerName, String customerAddress, String customerMailId,long customerContractNo) // it is an parameterized constructor is used  initialized the value
	{
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerMailId = customerMailId;
		this.customerContractNo = customerContractNo;
	}

	// Method     // method is real time entity
	public void displayCustomerDetails()
	{
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerAddress);
		System.out.println(customerMailId);
		System.out.println(customerContractNo);
	}
}

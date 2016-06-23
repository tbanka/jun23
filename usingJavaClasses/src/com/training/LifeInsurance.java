package com.training;

public class LifeInsurance {
	
	private long policyNumber;
	private String policyType;
	private double policyAmount;
	//private double premium;
	private String paymentmode;
	
	
	public LifeInsurance(long policyNumber, String policyType, double policyAmount, String paymentmode) {
		super();
		this.policyNumber = policyNumber;
		this.policyType = policyType;
		this.policyAmount = policyAmount;
		//this.premium = premium;
		this.paymentmode = paymentmode;
	}
	
	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	
	

}

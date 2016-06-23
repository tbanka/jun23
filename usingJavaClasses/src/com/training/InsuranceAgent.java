package com.training;

public class InsuranceAgent {

	private String agentName;
	
	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public double calculatePremium(LifeInsurance policy)
	{
		double premium = (policy.getPolicyAmount())/10.00;
		
		return premium;
	}

	public InsuranceAgent(String agentName) {
		super();
		this.agentName = agentName;
	}

	public InsuranceAgent() {
		super();
		// TODO Auto-generated constructor stub
	}
}

package com.Interface;

public class ApolloHosiptal implements USMedical,IndiaMedical {

	@Override
	public void generalService() {
		
		String Country="US";
		if(Country.equalsIgnoreCase("US")) {
			System.out.println("this is for us general services");
		}
		else {
			System.out.println("general services");
		}
	
	}

	@Override
	public void Ortho() {
		
		System.out.println("ortho services");
	}
	
	
	public void gynic() {
		System.out.println("gynic services");
	}
	
	public void Cardio() {
		System.out.println("Cardio services");
	}

	@Override
	public void NuroService() {
		System.out.println("nuro service for india");
		
	}

	@Override
	public void CovidTest() {
		System.out.println("covid test");
		
	}
	
	

}

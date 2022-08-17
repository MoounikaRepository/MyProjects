package com.Interface;

public class TestClass {
	
	public static void main(String[] args) {
		
		//USMedical u = new USMedical();
		ApolloHosiptal a = new ApolloHosiptal();//
		
		a.generalService();
		a.Ortho();
		a.gynic();
		a.Cardio();
		
		
		//top casting
		
		IndiaMedical i = new ApolloHosiptal();
		i.generalService();
		i.NuroService();
		i.CovidTest();
		
		USMedical u = new ApolloHosiptal();
		u.generalService();
		u.Ortho();
		u.CovidTest();
		
		
		USMedical.billing();
		
	}

}

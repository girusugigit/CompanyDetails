package org.company;

public class CompanyInfo {
	private String companyName(String a) {
		
		System.out.println("The Employee Name is \t"+a);;
		return a;
	} {
		

	}

	private int companyName(int b){
		
		
				System.out.println("The Name is \t"+b);
				return b;
	}
	

	

	private String companyName(String b,int c) {
		String cn=b+c;
				System.out.println("The company name is \t"+cn);
				return cn;

	}

	public static void main(String[] args) {
		CompanyInfo CI = new CompanyInfo();
		CI.companyName("US");
		CI.companyName(5);
		CI.companyName("US", 7);
		
		
	}
}

package org.company;
import org.client.Client;
public class Company extends Client {
private void companyname() {
System.out.println("Enter the company name");
}
public static void main(String[] args) {
	Company c=new Company();
	c.clientname();
	c.companyname();
}
}

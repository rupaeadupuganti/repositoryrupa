package Retail;
import java.math.*;
import java.util.Scanner;

public class RetailDiscount {
double billAmount,discount;
String employee,affiliate;
int ageOfCustomer;
int ai=2;
Scanner s=new Scanner(System.in);
public RetailDiscount(double billAmount, String employee, String affiliate, int ageOfCustomer) {
	super();
	this.billAmount = billAmount;
	this.employee = employee;
	this.affiliate = affiliate;
	this.ageOfCustomer = ageOfCustomer;
}
public double getBillAmount() {
	return billAmount;
}
public void setBillAmount(double billAmount) {
	this.billAmount = billAmount;
}
public String getEmployee() {
	return employee;
}
public void setEmployee(String employee) {
	this.employee = employee;
}
public String getAffiliate() {
	return affiliate;
}
public void setAffiliate(String affiliate) {
	this.affiliate = affiliate;
}
public int getAgeOfCustomer() {
	return ageOfCustomer;
}
public void setAgeOfCustomer(int ageOfCustomer) {
	this.ageOfCustomer = ageOfCustomer;
}



public void Discount() {
	   
     if(ageOfCustomer > 2)
    {
    	discount=0.05;
    	billAmount=billAmount-discount;
    	System.out.println("your bill is:"+billAmount);
}
    else if(billAmount>100)
    	
    {
    	double a=billAmount/100;
    	discount = Math.round(a)*5;
    	
    	billAmount=billAmount-discount;
    	System.out.println("your bill is:"+billAmount);
    }
}


}


package Retail;

import java.util.Scanner;

public class TestRetail {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of customers");
	int n=sc.nextInt();
	
	RetailDiscount rd[] = new RetailDiscount[n];
	/*int i=0;
    while (i<=n-1) {
    	System.out.println("enter the billAmount");
        double ba = sc.nextDouble();
        System.out.println("Enter if you are an employee of the store or not");
        String e=sc.next();
        System.out.println("Enter if you are an affiliate of the store");
        String a=sc.next();
        System.out.println("Enter since how many years you are a customer");
        int aoc=sc.nextInt();
       rd[i]=new RetailDiscount(ba,e,a,aoc);
       
       //System.out.println(rd[i].getBillAmount()+rd[i].getEmployee()+rd[i].getAffiliate()+rd[i].getAgeOfCustomer());
    	i++;
       
    } */

    for(int i=0;i<n;i++)
    {
    	System.out.println("enter the billAmount");
        double ba = sc.nextDouble();
        System.out.println("Enter if you are an employee of the store or not,yes or no");
        String e=sc.next();
        System.out.println("Enter if you are an affiliate of the store,yes or no");
        String a=sc.next();
        System.out.println("Enter since how many years you are a customer in the form of numbers");
        int aoc=sc.nextInt();
       rd[i]=new RetailDiscount(ba,e,a,aoc);
       
       
      rd[i].Discount();
      // System.out.println(rd[i].getBillAmount()+rd[i].getEmployee()+rd[i].getAffiliate()+rd[i].getAgeOfCustomer());
        
        
    }
}
}


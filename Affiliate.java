package Retail;

public class Affiliate extends RetailDiscount {

	public Affiliate(double billAmount, String employee, String affiliate, int ageOfCustomer) {
		super(billAmount, employee, affiliate, ageOfCustomer);
		// TODO Auto-generated constructor stub
	}
	public void Discount() {
		if(affiliate =="yes")
		{
			discount=0.1;
			billAmount=billAmount-discount;
			System.out.println("your bill is:"+billAmount);
		}
		else
		{
			System.out.println("your bill is:"+billAmount);	
		}
	}
}

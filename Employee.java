package Retail;

public class Employee extends RetailDiscount {

	public Employee(double billAmount, String employee, String affiliate, int ageOfCustomer) {
		super(billAmount, employee, affiliate, ageOfCustomer);
		// TODO Auto-generated constructor stub
	}
	public void Discount() {
		   
		   
		
		 if(employee == "yes")
		{
			discount=0.3;
			billAmount=billAmount-discount;
			System.out.println("your bill is:"+billAmount);
		}
		 else
		 {
			 System.out.println("your bill is : "+billAmount);
		 }
	}
}


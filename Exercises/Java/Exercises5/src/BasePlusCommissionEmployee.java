// Mehmet VARAN 181805009 
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	
	public BasePlusCommissionEmployee() {
		
	}

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
		while (baseSalary < 0) {
			System.out.println("Gross Sales must be equal or greater than 0.");
			baseSalary = super.gettingNumber(baseSalary);
		}
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double getPaymentAmount() {
		return super.getPaymentAmount() + baseSalary;
	}
	public String toString() {
		System.out.println("Base Plus Commission Employee Informations");
		return "Name and Surname: " + super.getFirstName() + " " + super.getLastName() + "\n" + "Social Security Number: " + super.getSocialSecurityNumber() + "\n" + "Gross Sales: $" + super.getGrossSales() + ",  CommissionRate: " + super.getCommissionRate() + ",  Base Salary: $" + baseSalary + "\n" + "Earnings: $" + getPaymentAmount() + "\n"  ;
	}
	

}

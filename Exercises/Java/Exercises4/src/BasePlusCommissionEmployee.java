// Mehmet VARAN 181805009 
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double earnings() {
		return super.earnings() + baseSalary;
	}
	public String toString() {
		System.out.println("Base Plus Commission Employee Informations");
		return "Name and Surname: " + super.getFirstName() + " " + super.getLastName() + "\n" + "Social Security Number: " + super.getSocialSecurityNumber() + "\n" + "Gross Sales: $" + super.getGrossSales() + ",  CommissionRate: " + super.getCommissionRate() + ",  Base Salary: $" + baseSalary + "\n" + "Earnings: $" + earnings() + "\n"  ;
	}
	

}

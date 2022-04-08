// Mehmet VARAN 181805009
public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commisionRate;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	public double earnings() {
		return grossSales*commissionRate;
	}
	public String toString() {
		System.out.println("Commission Employee Informations");
		return super.toString() + "Gross Sales: $" + grossSales + ",  Commision Rate: " + commissionRate + "\n" + "Earnings: $" + earnings() + "\n" ;
	}

}

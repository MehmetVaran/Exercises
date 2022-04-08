// Mehmet VARAN 181805009
public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee() {
		
	}
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate) {
		super(firstName, lastName, socialSecurityNumber);
		while (grossSales < 0) {
			System.out.println("Gross Sales must be equal or greater than 0.");
			grossSales = super.gettingNumber(grossSales);
		}
		this.grossSales = grossSales;
		while (commissionRate <= 0 && commissionRate >= 1) {
			System.out.println("Commission Rate must be between 0 and 1.");
			commissionRate = super.gettingNumber(commissionRate);
			}
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
	public double getPaymentAmount() {
		return grossSales*commissionRate;
	}
	public String toString() {
		System.out.println("Commission Employee Informations");
		return super.toString() + "Gross Sales: $" + grossSales + ",  Commision Rate: " + commissionRate + "\n" + "Earnings: $" + getPaymentAmount() + "\n" ;
	}

}

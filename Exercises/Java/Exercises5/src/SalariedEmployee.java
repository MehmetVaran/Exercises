// Mehmet VARAN 181805009
public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		while (weeklySalary < 0) {
			System.out.println("Weekly Salary must be equal or greater than 0.");
			weeklySalary = super.gettingNumber(weeklySalary);
		}
		this.weeklySalary = weeklySalary;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public double getPaymentAmount() {
		return weeklySalary;
	}
	public String toString() {
		System.out.println("Salaried Employee Informations");
		return super.toString() + "Weekly Salary : $" + weeklySalary + "\n" + "Earnings: $" + getPaymentAmount() + "\n"; 
	}

}

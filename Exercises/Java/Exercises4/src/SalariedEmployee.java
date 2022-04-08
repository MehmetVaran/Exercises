// Mehmet VARAN 181805009
public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public double earnings() {
		return weeklySalary;
	}
	public String toString() {
		System.out.println("Salaried Employee Informations");
		return super.toString() + "Weekly Salary : $" + weeklySalary + "\n" + "Earnings: $" + earnings() + "\n"; 
	}

}

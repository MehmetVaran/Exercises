// Mehmet VARAN 181805009
public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	private double money;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double earnings() {
		if (hours <= 40) {
			money = wage*hours;
		}
		else if (hours > 40) {
			money = 40*wage + (hours - 40)*wage*1.5; 
		}
		return money;
	}
	public String toString() {
		System.out.println("Hourly Employee Informations");
		return super.toString() + "Hourly Wage: $" + wage + ",  Hours Worked: " + hours + "\n" + "Earnings: $" + earnings() + "\n";
	}
}

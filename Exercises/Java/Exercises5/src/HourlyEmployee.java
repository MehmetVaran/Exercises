// Mehmet VARAN 181805009
public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	private double money;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		while (wage < 0) {
			System.out.println("Wage must be equal or greater than 0.");
			wage = super.gettingNumber(wage);
			}
		this.wage = wage;
		while (hours < 0 && hours >= 168) {
			System.out.println("Hours must be between 0 and 168.");
			hours = super.gettingNumber(hours);
		}
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
	public double getPaymentAmount() {
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
		return super.toString() + "Hourly Wage: $" + wage + ",  Hours Worked: " + hours + "\n" + "Earnings: $" + getPaymentAmount() + "\n";
	}
}

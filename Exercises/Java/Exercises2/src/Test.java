// Mehmet VARAN 181805009
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CommisionEmployee CommisionEmployee1 = new CommisionEmployee();
		CommisionEmployee1.setFirstName("Mehmet");
		CommisionEmployee1.setLastName("Varan");
		CommisionEmployee1.setSocialSecurityNumber("111-11-1111");
		CommisionEmployee1.setGrossSales(10000);
		CommisionEmployee1.setCommisionRate(0.06);
		CommisionEmployee1.printingCE();
		CommisionEmployee1.setGrossSales(gettingGrossSale());
		CommisionEmployee1.setCommisionRate(gettingCommisionRate());
		System.out.println("");
		CommisionEmployee1.printingCE();
		
		BasePlusCommisionEmployee BasePlusCommisionEmployee1 = new BasePlusCommisionEmployee();
		BasePlusCommisionEmployee1.setFirstName("Melih");
		BasePlusCommisionEmployee1.setLastName("Varan");
		BasePlusCommisionEmployee1.setSocialSecurityNumber("888-88-8888");
		BasePlusCommisionEmployee1.setGrossSales(5000);
		BasePlusCommisionEmployee1.setCommisionRate(0.04);
		BasePlusCommisionEmployee1.setBaseSalary(300);
		BasePlusCommisionEmployee1.printingBPCE();
		BasePlusCommisionEmployee1.setGrossSales(gettingGrossSale());
		BasePlusCommisionEmployee1.setCommisionRate(gettingCommisionRate());
		BasePlusCommisionEmployee1.setBaseSalary(gettingBaseSalary());
		System.out.println("");
		BasePlusCommisionEmployee1.printingBPCE();
		

	}
	
	public static double gettingGrossSale() {
		Scanner input = new Scanner(System.in);
		double x = 0;
		try {
			System.out.print("Enter gross sale: ");
			x = input.nextDouble();
		}
		catch (Exception e){
			System.out.println("Gross sale must be greater than or equal to 0!");
			x = gettingGrossSale();
		}
		if (x < 0) {
			System.out.println("Gross sale must be greater than or equal to 0!");
			x = gettingGrossSale();
		}
		return x;
	}
	
	public static double gettingCommisionRate() {
		Scanner input = new Scanner(System.in);
		double x = 0;
		try {
			System.out.print("Enter commision rate: ");
			x = input.nextDouble();
		}
		catch (Exception e){
			System.out.println("Commision rate must be greater than 0 and less than 1!");
			x = gettingCommisionRate();
		}
		if (x < 0 || x > 1) {
			System.out.println("Commision rate must be greater than 0 and less than 1!");
			x = gettingCommisionRate();
		}
		return x;
	}
	
	public static double gettingBaseSalary() {
		Scanner input = new Scanner(System.in);
		double x = 0;
		try {
			System.out.print("Enter base salary: ");
			x = input.nextDouble();
		}
		catch (Exception e){
			System.out.println("Base salary must be greater than or equal to 0!");
			x = gettingBaseSalary();
		}
		if (x < 0) {
			System.out.println("Base salary be greater than or equal to 0!");
			x = gettingBaseSalary();
		}
		return x;
	}
}


class CommisionEmployee {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commisionRate;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	public double earnings(double x, double y) {
		return x*y;
	}
	public void printingCE() {
		System.out.println("---CommisionEmployee Information---");
		System.out.println("");
		System.out.println("Firt Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Social Security Number: " + socialSecurityNumber);
		System.out.println("Gross Sales: " + grossSales);
		System.out.println("Commision Rate: " + commisionRate);
		System.out.println("Earnings: " + earnings(grossSales , commisionRate ));
		System.out.println("");
	}
}

class BasePlusCommisionEmployee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commisionRate;
	private double baseSalary;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double earnings(double x, double y, double z) {
		return z + x*y;
	}
	public void printingBPCE() {
		System.out.println("---BasePlusCommisionEmployee Information---");
		System.out.println("");
		System.out.println("Firt Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Social Security Number: " + socialSecurityNumber);
		System.out.println("Gross Sales: " + grossSales);
		System.out.println("Commision Rate: " + commisionRate);
		System.out.println("Base Salary:" + baseSalary);
		System.out.println("Earnings: " + earnings(grossSales , commisionRate, baseSalary ));
		System.out.println("");
	}
}
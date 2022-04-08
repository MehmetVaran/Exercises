// Mehmet VARAN 181805009
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		double number;
		Scanner input = new Scanner(System.in);
		SalariedEmployee SalariedEmployee1 = new SalariedEmployee("John", "Smith", "111-11-111", 800); 
		HourlyEmployee HourlyEmployee1 = new HourlyEmployee("Karen", "Price", "222-22-222", 16.75, 40);
		CommissionEmployee CommissionEmployee1 = new CommissionEmployee("Sue", "Jones", "333-33-333", 10000, 0.06);
		BasePlusCommissionEmployee BasePlusCommissionEmployee1 = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-444", 5000, 0.04, 300);
		Employee[] employees = new Employee[4];
		
		number = SalariedEmployee1.getWeeklySalary(); // validation for weekly salary
		while (number < 0) {
			System.out.println("Weekly Salary must be equal or greater than 0.");
			number = gettingNumber(number);
		}
		SalariedEmployee1.setWeeklySalary(number);
		
		number = HourlyEmployee1.getWage(); // validation for wage
		while (number < 0) {
			System.out.println("Wage must be equal or greater than 0.");
			number = gettingNumber(number);
		}
		HourlyEmployee1.setWage(number);
		
		number = HourlyEmployee1.getHours(); // validation for hours
		while (number < 0 && number >= 168) {
			System.out.println("Hours must be between 0 and 168.");
			number = gettingNumber(number);
		}
		HourlyEmployee1.setHours(number);
		
		number = CommissionEmployee1.getGrossSales(); // validation for gross sales
		while (number < 0) {
			System.out.println("Gross Sales must be equal or greater than 0.");
			number = gettingNumber(number);
		}
		CommissionEmployee1.setGrossSales(number);
		
		number = CommissionEmployee1.getCommissionRate(); // validation for commission rate 
		while (number <= 0 && number >= 1) {
			System.out.println("Commission Rate must be between 0 and 1.");
			number = gettingNumber(number);
		}
		CommissionEmployee1.setCommissionRate(number);
		
		number = BasePlusCommissionEmployee1.getGrossSales(); // validation for gross sales
		while (number < 0) {
			System.out.println("Gross Sales must be equal or greater than 0.");
			number = gettingNumber(number);
		}
		BasePlusCommissionEmployee1.setGrossSales(number);
		
		number = BasePlusCommissionEmployee1.getCommissionRate(); // validation for commission rate 
		while (number <= 0 && number >= 1) {
			System.out.println("Commission Rate must be between 0 and 1.");
			number = gettingNumber(number);
		}
		BasePlusCommissionEmployee1.setCommissionRate(number);
		
		number = BasePlusCommissionEmployee1.getBaseSalary(); // validation for base salary
		while (number < 0 ) {
			System.out.println("Base Salary must be equal or greater then 0.");
			number = gettingNumber(number);
		}
		BasePlusCommissionEmployee1.setBaseSalary(number);
		
		System.out.println(SalariedEmployee1.toString());
		System.out.println(HourlyEmployee1.toString());
		System.out.println(CommissionEmployee1.toString());
		System.out.println(BasePlusCommissionEmployee1.toString());
		
		employees[0] = SalariedEmployee1;
		employees[1] = HourlyEmployee1;
		employees[2] = CommissionEmployee1;
		employees[3] = BasePlusCommissionEmployee1;
		System.out.println("-----Employee Array Processed Polymorphically-----\n");
		
		for (int i = 0; i < 4; i++) {
			if (employees[i] instanceof BasePlusCommissionEmployee) {
				System.out.println("Base Plus Commission Employee Informations");
				System.out.println("Name and Surname" + employees[i].getFirstName() + " " + employees[i].getLastName());
				System.out.println("Social Security Number: " + employees[i].getSocialSecurityNumber());
				System.out.println("Gross Sales: $" + BasePlusCommissionEmployee1.getGrossSales() + ",  CommissionRate: " + BasePlusCommissionEmployee1.getCommissionRate() + ",  Base Salary: " + BasePlusCommissionEmployee1.getBaseSalary());
				BasePlusCommissionEmployee1.setBaseSalary(BasePlusCommissionEmployee1.getBaseSalary()*1.1);
				System.out.println("New base salary with %10 increase is: $" + BasePlusCommissionEmployee1.getBaseSalary());
				System.out.println("Earnings: $" + employees[i].earnings());
			}
			else {
			System.out.println(employees[i].toString());}
		}
		System.out.println();
		
		for (int j = 0; j < 4; j++) {
			System.out.println("Employee " + j + " is a " + employees[j].getClass().getName());
		}
	}
	
	public static double gettingNumber(double number) {
		Scanner input = new Scanner(System.in);
		double x = number;
		
		try {
			System.out.println("Enter the value: ");
			x = input.nextDouble();
		}
		catch (Exception e){
			System.out.println("You have entered the wrong data type. Use only digits!");
			x = gettingNumber(x);
		}
		return x;
	}

}

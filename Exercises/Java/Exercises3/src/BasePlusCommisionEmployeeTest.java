// Mehmet VARAN 181805009
public class BasePlusCommisionEmployeeTest {

	public static void main(String[] args) {
		BasePlusCommisionEmployee BasePlusCommisionEmployee1 = new BasePlusCommisionEmployee("Mehmet", "Varan", "333-33-333", 5000, 0.04);
		BasePlusCommisionEmployee1.setBaseSalary(300);
		System.out.println("Employee information obtained by getting methods and earnings:\n");
		System.out.println("Firt Name: " + BasePlusCommisionEmployee1.getFirstName());
		System.out.println("Last Name: " + BasePlusCommisionEmployee1.getLastName());
		System.out.println("Social Security Number: " + BasePlusCommisionEmployee1.getSocialSecurityNumber());
		System.out.println("Gross Sales: " + BasePlusCommisionEmployee1.getGrossSales());
		System.out.println("Commision Rate: " + BasePlusCommisionEmployee1.getCommisionRate());
		System.out.println("Base Salary: " + BasePlusCommisionEmployee1.getBaseSalary());
		System.out.println("Earnings: " + BasePlusCommisionEmployee1.earnings());
		System.out.println("");
		
		BasePlusCommisionEmployee1.setBaseSalary(1000);
		System.out.println(BasePlusCommisionEmployee1.toString());
	

	}

}

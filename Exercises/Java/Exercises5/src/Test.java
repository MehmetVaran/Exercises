import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		double number = 0;
		Scanner input = new Scanner(System.in);
		Payable payableObjects[] = new Payable[6];
		payableObjects[0] = new Invoice(1234, "seat", 375, 750);
		payableObjects[1] = new Invoice(56789, "tire", 79.85, 319.80);
		payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-111", 800); 
		payableObjects[3] = new HourlyEmployee("Karen", "Price", "222-22-222", 16.75, 40);
		payableObjects[4] = new CommissionEmployee("Sue", "Jones", "333-33-333", 10000, 0.06);
		payableObjects[5] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-444", 5000, 0.04, 300);
		
		
		System.out.println("------Invoices and Employees Processed Polymorphically------");
		for (int i = 0; i < 6; i++) {
			if (payableObjects[i] instanceof BasePlusCommissionEmployee) {
				System.out.println(payableObjects[i].toString());
				BasePlusCommissionEmployee BasePlusCommissionEmployee1 = new BasePlusCommissionEmployee();
				BasePlusCommissionEmployee1 = (BasePlusCommissionEmployee) payableObjects[i]; 
				BasePlusCommissionEmployee1.setBaseSalary(BasePlusCommissionEmployee1.getBaseSalary() * 1.1);
				System.out.println("New base salary with %10 increase is: " + BasePlusCommissionEmployee1.getBaseSalary());
				System.out.println("Payment Amount: " + BasePlusCommissionEmployee1.getPaymentAmount());	
			}
			else {
				System.out.println(payableObjects[i].toString());
			}
		}
		
	}
	
	

}

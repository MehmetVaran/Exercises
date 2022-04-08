import java.util.Scanner;

// Mehmet VARAN 181805009 
public abstract class Employee implements Payable {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee() {
		
	}
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
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
	public String toString() {
		return "Name and Surname: " + firstName + " " + lastName + "\n" + "Social Security Number: " + socialSecurityNumber + "\n" ;
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

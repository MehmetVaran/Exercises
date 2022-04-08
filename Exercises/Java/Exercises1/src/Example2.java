import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double tax = 0;
		System.out.println("First enter the age, then salary.");
		int age = input.nextInt();
		double salary = input.nextDouble();
		if ((age >= 75) && (age <= 95)) {
			tax = (14000 * 0.16) + ((salary - 14000) / 4);
			System.out.print("Your tax is " + tax);
		}
		else if ((age >= 51) && (age < 75) ) {
			tax = (29000 * 0.16) + ((salary - 29000) / 4);
			System.out.print("Your tax is " + tax);
		}
		else if ((age > 35 ) && (age <=50)) {
			tax = (23000 * 0.16) + ((salary - 23000) / 4);
			System.out.print("Your tax is " + tax);
		}
		else if ((age >= 18) && (age <= 35)) {
			tax = (17000 * 0.16) + ((salary - 17000) / 4);
			System.out.print("Your tax is " + tax);
		}
		else {
			System.out.print("You dont need to pay tax!!");
		}
		
		
	}

}

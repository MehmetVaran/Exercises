// Mehmet VARAN - 181805009
import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		double[] moneyArray = {100,100,100,100,100,100,100,100,100,100};
		Scanner input = new Scanner(System.in);
		int accountChoice = 0, choice = 0, Checker = 0;
		while (accountChoice != -1) {
			System.out.print("Enter an id: ");
			accountChoice = input.nextInt();
			Checker = accountNumberCheck(accountChoice);
			
			while (Checker == 0) {
				System.out.print("You have entered wrong id. Please enter an id from 0 to 9: ");
				accountChoice = input.nextInt();
				accountNumberCheck(accountChoice);
			}
			Checker = 0;
			choice = 0;
			while (choice != 4) {
				instructions();
				choice = input.nextInt();
					
				if (choice == 1) {
					System.out.println("The balance is  " + moneyArray[accountChoice]);
				}
					
				if (choice == 2) {
					moneyArray[accountChoice] = withdraw(moneyArray[accountChoice]);
					}
				
				if (choice == 3) {
					moneyArray[accountChoice] = deposit(moneyArray[accountChoice]);
					}
				if (choice > 4 ) {
					System.out.println("You have entered wrong number!!");
					}
						
				}
			
		}
		
	}
	public static int accountNumberCheck(int check) {
		if (check >= 0 && check <= 9) {
			return 1;
			}
		else {
			return 0;
		}
	}

	public static void instructions() {
		System.out.println("Main Menu");
		System.out.println("1: Check Balance");
		System.out.println("2: Withdraw");
		System.out.println("3: Deposit");
		System.out.println("4: Exit");
		System.out.print("Enter a choice: ");
	}
	
	public static double withdraw(double money) {
		double number = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount to withdraw: ");
		number = input.nextDouble();
		money = money - number;
		return money;
	}
	
	public static double deposit(double money) {
		double number = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount to deposit: ");
		number = input.nextDouble();
		money = money + number;
		return money;
	}
	
}

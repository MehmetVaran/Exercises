import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	int number = 0, x = -1, counter = 0;
	Scanner input = new Scanner(System.in);
	number = (int)(Math.random()* 100);
	
	while (number != x) {
		x = input.nextInt();
		counter += 1;
		if ( number > x) {
			System.out.println("Please enter a higher number");
		}
		else if ( number < x) {
			System.out.println("Please enter a lower number");
		}
	}
	System.out.print("You found the number at attempt " + counter);
	
	

	}

}

import java.util.Scanner;

// Mehmet VARAN 181805009
public class Invoice implements Payable{
	private double partNumber;
	private String partDescription;
	private double quantity;
	private double pricePerItem;
	
	public Invoice(double partNumber, String partDescription, double quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		while (quantity < 0) {
			System.out.println("Quantity must be equal or greater than 0.");
			quantity = gettingNumber(quantity);
		}
		this.quantity = quantity;
		
		while (pricePerItem <= 0) {
			System.out.println("Price must be greater than 0.");
			pricePerItem = gettingNumber(pricePerItem);
		}
		this.pricePerItem = pricePerItem;
	}
	public double getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(double partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	public double getPaymentAmount() {
		return quantity*pricePerItem;
	}
	public String toString() {
		System.out.println("Invoice:");
		return "Part Number: " + partNumber + " (" + partDescription + ")\n" + "Quantity: " + quantity + "\n" + "Price Per Item: $" + pricePerItem + "\n" + "Payment Amount: $" + getPaymentAmount() + "\n" ;
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

// Mehmet VARAN 181805009
class CommisionEmployee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commisionRate;
	
	CommisionEmployee (String fN, String lN, String sSN, double gS, double cR ){
		firstName = fN;
		lastName = lN;
		socialSecurityNumber = sSN;
		grossSales = gS;
		commisionRate = cR;
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
	public double earnings() {
		return grossSales*commisionRate;
	}
	public String toString() {
		return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Social Security Number: " + socialSecurityNumber + "\n" + "Gross Sales: " + grossSales + "\n" + "Commision Rate: " + commisionRate + "\n" ;
	}

}

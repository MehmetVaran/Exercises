// Mehmet VARAN 181805009
class BasePlusCommisionEmployee extends CommisionEmployee {
	BasePlusCommisionEmployee(String fN, String lN, String sSN, double gS, double cR) {
		super(fN, lN, sSN, gS, cR);
	}
	
	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double earnings() {
		return super.earnings() + baseSalary;
	}
	public String toString() {
		System.out.println("Updated employee information obtained by toString and earnings:\n");
		return super.toString() + "Base Salary: " + baseSalary + "\n" + "Earnings: " + earnings() ;
	}
} 
package chapter09HW;
// This class also inherits from the CompensationModel class
public class BasePlusCommissionCompensationModel extends CompensationModel {
	// Create the instance variables for the class
	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
	// Create a constructor to initialize the instance variables
	public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}
	
	// Create the setter methods
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	// Override the inherited earnings method from the CompensationModel class
	@Override
	public double earnings() 
	{ return baseSalary + (grossSales * commissionRate);	}
}

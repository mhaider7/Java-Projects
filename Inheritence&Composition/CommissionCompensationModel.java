package chapter09HW;
// This class inherits from the CompensationModel class
public class CommissionCompensationModel extends CompensationModel {
	private double grossSales;
	private double commissionRate;
	
	// Create a constructor to initialize the instance variables
	public CommissionCompensationModel(double grossSales, double commissionRate) {
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	// Create the setter methods
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;		
		}
		
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	// Override the earnings method from the CompensationModel class
	@Override
	public double earnings() {
		return grossSales * commissionRate;
	}
}

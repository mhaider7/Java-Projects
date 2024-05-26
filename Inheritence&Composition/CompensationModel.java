// October 30, 2023
/* This program demonstrate the use of both inheritance and composition. A superclass CompensatonModel is declared
 * which contains only the earnings methods. Then classes CommissionCompensationModel and BasePlusCommissionCompositionModel 
 * are created to inherit from the CompensationModel class while adding in their own attributes and overriding 
 * the earnings method. Next a class Employee is created to include the CompensationClass as its instance variable.
 * The Employee class will carry the rest of the general data for and employee including the data from the CompensationClass.
 * A test class is then created to test the functionality from the Employee class passing in the 2 subclasses to the Employee constructor.
 */

package chapter09HW;
// Declare the CompensationModel class as abstract to have a abstract method without a body that can be inherited and overridden
public abstract class CompensationModel {
	public abstract double earnings();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Pierre
 */
public class SalaryBonusEmployee extends SalaryEmployee implements Bonus{
    
    private double bonus;

    public SalaryBonusEmployee(double annualSalary, String name, String jobTitle) {
        super(annualSalary, name, jobTitle);
    }

    public SalaryBonusEmployee(double bonus, double annualSalary, String name, String jobTitle) {
        super(annualSalary, name, jobTitle);
        this.bonus = bonus;
    }
    
    
    
    //----------------Methods------------------
    
    public double getBonus() {
        return bonus;
    }
    
    public void payBonus(double pay) {
        bonus = pay;
    }
    
    @Override public double getMonthlyWage() {
        return super.getAnnualSalary() / 12 + bonus;
    }
    
    @Override public String toString() {
        return super.toString() + " includes " + this.getBonus() + " bonus";
    }
    
    @Override public String formatForOutput() {
        return this.getName() + "," +
               this.getJobTitle() + "," +
               this.getAnnualSalary() + "," + 
               this.getBonus();
    }
}

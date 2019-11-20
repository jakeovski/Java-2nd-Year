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
public class SalaryEmployee extends Employee{
    
    private double annualSalary;

    public SalaryEmployee(double annualSalary, String name, String jobTitle) {
        super(name, jobTitle);
        this.annualSalary = annualSalary;
    }
    
    
    //--------------Getters-----------

    public double getAnnualSalary() {
        return annualSalary;
    }
    
    
    //--------------Setters----------

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    
    
    //--------------Others-----------------
    
    @Override public String toString() {
        return super.toString() + "\nAnnual Salary: " + getAnnualSalary();
    }
    
    @Override public double getMonthlyWage() {
        return annualSalary / 12;
    }
    
    @Override public String formatForOutput() {
        return this.getName() + "," +
               this.getJobTitle() + "," +
               this.getAnnualSalary();
    }

}

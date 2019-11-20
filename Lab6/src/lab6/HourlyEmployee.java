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
public class HourlyEmployee extends Employee {
    
    private double hourlyRate;
    
    private double hoursWorked;

    public HourlyEmployee(double hourlyRate, double hoursWorked, String name, String jobTitle) {
        super(name, jobTitle);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    //-------------Getter-----------------

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    
    //-----------------Setter---------------

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    //---------------Others-------------------
    
    @Override public String toString() {
        return super.toString() + "\nHourly Rate: " + getHourlyRate() + "\nHours worked: " + getHoursWorked();
    }
    
    
    @Override public double getMonthlyWage() {
        return getHourlyRate() * getHoursWorked();     
    }
    
    @Override public String formatForOutput() {
        return this.getName() + "," +
               this.getJobTitle() + "," + 
               this.getHourlyRate() + "," +
               this.getHoursWorked();
    }
}

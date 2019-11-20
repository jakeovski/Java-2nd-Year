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
public class HourlyBonusEmployee extends HourlyEmployee implements Bonus{
    
    private double bonusRate;

    public HourlyBonusEmployee(double hourlyRate, double hoursWorked, String name, String jobTitle) {
        super(hourlyRate, hoursWorked, name, jobTitle);
    }


    @Override
    public double getBonus() {
        return bonusRate;
    }

    @Override
    public void payBonus(double pay) {
        bonusRate = pay;
    }
    
    @Override public double getMonthlyWage() {
        return super.getMonthlyWage() * (1.0 * this.getBonus());
    }
    
    @Override public String toString() {
        return super.toString() + " includes " + this.getBonus() + super.getMonthlyWage() + " bonus.";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Pierre
 */
public class Payroll {
    
    private ArrayList<Employee> roll;

    public Payroll(ArrayList<Employee> roll) {
        this.roll = roll;
    }

    public Payroll() {
        this.roll = new ArrayList<>();
    }
    
    
    //----------------------Getter-------------------

    public ArrayList<Employee> getRoll() {
        return roll;
    }
    
    
    //----------------------Setter-------------------

    public void setRoll(ArrayList<Employee> roll) {
        this.roll = roll;
    }
    
    
    //---------------------Others-------------------
    
    public void add(Employee employee) {
        roll.add(employee);
    }
    
    public void setContractHours(String name, int hours) {
        for(Employee i : roll) {
            if (i instanceof HourlyEmployee) {
                if (i.getName().equals(name)) {
                     ((HourlyEmployee) i).setHoursWorked(hours);
                }
            }
        }
    }
    
    public double getCompanyMonthlyWage() {
        double total = 0;
        for (Employee i : roll) {
            total += i.getMonthlyWage();
        }
        return total;
    }
    
    public void resetContractHours() {
        for(Employee i : roll) {
            if (i instanceof HourlyEmployee){
                ((HourlyEmployee) i).setHoursWorked(0);
            }
        }
    }
    
    public String getCompanyDetails() {
        String output = "";
        for(Employee i : roll) {
            output += i.toString() + "\n";
        }
        return output;
    }
    
    public void sortByWages() {
        Collections.sort(this.roll);
    }
    
}

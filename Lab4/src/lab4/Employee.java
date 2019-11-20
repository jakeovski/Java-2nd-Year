/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Pierre
 */
public abstract class Employee implements Comparable<Employee> {
    
    private String name;
    
    private String jobTitle;

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }
    
    //-----------Getter---------------

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    
    //------Setter--------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    //-------------Others--------------------
    
    public boolean matchName(String name1) {
        if (name1.equals(getName())) {
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override public String toString() {
        return "Name: " + getName() + "\nJobTitle: " + getJobTitle();
    }
    
    public abstract double getMonthlyWage();
    
    @Override public int compareTo(Employee that) {
        if (this.getMonthlyWage() > that.getMonthlyWage()) {
            return 1;
        }
        else if (this.getMonthlyWage() < that.getMonthlyWage()) {
            return -1;
        }
        else {
            return 0;
        }
    }

}

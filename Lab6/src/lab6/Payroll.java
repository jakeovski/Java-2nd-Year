/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
    
    public void loadData(File f) throws FileNotFoundException {
        try {
            Scanner in = new Scanner(f);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String bits[] = line.split(",");
                String name = bits[0];
                if (bits[1].equals("1")) {
                    String jobType = bits[2];
                    double annualSalary = Double.parseDouble(bits[3]);
                    roll.add(new SalaryEmployee(annualSalary, name, jobType));
                }
                else if (bits[1].equals("2")) {
                    String jobType2 = bits[2];
                    double hourlyRate = Double.parseDouble(bits[3]);
                    int hours = Integer.parseInt(bits[4]);
                    roll.add(new HourlyEmployee(hourlyRate, hours, name, jobType2));
                }
                else if (bits[1].equals("3")) {
                    String jobType3 = bits[2];
                    double annualSalary2 = Double.parseDouble(bits[3]);
                    double bonus = Double.parseDouble(bits[4]);
                    roll.add(new SalaryBonusEmployee(bonus,annualSalary2,name,jobType3));
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.exit(1);
        }
    }
    
    public void saveData(File f) throws IOException {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(f));
            
            for (Employee e : roll) {
                w.write(e.formatForOutput());
                w.newLine();
            }
            w.flush();
            w.close();
        } catch (Exception x ) {
            System.exit(1);
        }
    }

}

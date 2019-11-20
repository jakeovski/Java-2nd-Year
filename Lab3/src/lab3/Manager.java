/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Pierre
 */
public class Manager extends Employee {

    public Manager(int years, String name, String age, String number) {
        super(years, name, age, number);
    }
    
    //--------------------Others--------------------------
    
    @Override public int getHoliday() {
        int holiday = 15;
        for (int i = 1; i <= super.getYears();i++ ) {
            if ( i % 5 == 0) {
                holiday += 2;
            }
        }
        return holiday;
    }
    
}

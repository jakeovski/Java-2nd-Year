/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Pierre
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Payroll list = new Payroll();
        
        File inFile = new File("employeeData.csv");
        
        list.loadData(inFile);
        
        System.out.println(list.getCompanyDetails());
        
        File outFile = new File("lab6doneBOII.csv");
        list.saveData(outFile);
    }
    
}

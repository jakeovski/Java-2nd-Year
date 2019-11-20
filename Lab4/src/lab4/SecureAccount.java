/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author Pierre
 */
public class SecureAccount extends Account implements PINProtected {
    
    //---------------Field-------------------
  
    private String pin;

    //-----------------Constructor---------------------------------
    public SecureAccount(String name, double balance) {
        super(name, balance);
        this.pin = "1234";
    }

    public SecureAccount(String pin, String name, double balance) {
        super(name, balance);
        this.pin = pin;
    }
    
    //--------------------Getter------------------------------
    
    public String getPin() {
        if(this.checkPIN() == true) {
            return pin;
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect PIN");
            return "-1.0";
        }
    }
    
    //--------------------Setter-------------------------------

    public void setPin(String pin) {
        if(this.checkPIN() == true) {
            this.pin = pin;
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect PIN");
        }
    }
    
    //------------------------Others--------------------------

    @Override
    public boolean checkPIN() {
        String s = JOptionPane.showInputDialog("Please input your PIN");
        return s.equals(pin);
    }
       
}

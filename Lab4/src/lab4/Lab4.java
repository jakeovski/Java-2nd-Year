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
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        
        //--------------------Vehicle TOLLS TASK-------------------------
        Vehicle moto1 = new Motorcycle("112", "12:00");
        
        System.out.println(moto1.toString());
        
        Vehicle car1 = new Car(true, "221", "13:00");
        
        System.out.println(car1.toString());
        
        Vehicle bus = new Bus(19,"2211","14:30");
        
        System.out.println(bus.toString());
        
        Vehicle hgv = new HGV(10,"332","15:00");
        
        System.out.println(hgv.toString());
        
        */
        /*
        TollRecords toll = new TollRecords();
        
        toll.addVehicle(new Motorcycle("112", "12:00"));
        
        toll.addVehicle(new Car(true, "221", "13:00"));
        
        toll.addVehicle(new Bus(19,"2211","14:30"));
        
        toll.addVehicle(new HGV(10,"332","15:00"));
        
        System.out.println(toll.totalCost());
        
        toll.cars();
        */
        
        
        //-------------------------PAYROLL TASK------------------
    
 /*
       HourlyEmployee emp1 = new HourlyEmployee(8,25,"Vlad", "Manager");
       
       System.out.println(emp1.toString());
       
       System.out.println(emp1.getMonthlyWage());
       
       Payroll roll = new Payroll();
       
       roll.add(emp1);
       
       roll.add(new SalaryEmployee(30000,"Gordei","Fuckboyy"));
       
       roll.add(new HourlyEmployee(7,21,"Nastja","Gril"));
       
       roll.setContractHours("Vlad", 69);
       
       
       System.out.println(roll.getCompanyMonthlyWage());
       
      System.out.println(emp1.compareTo(new SalaryEmployee(3000,"Gordei","Fuckboyy")));
      
      System.out.println(new HourlyEmployee(7,21,"Nastja","Gril").compareTo(emp1));
      
      System.out.println(roll.getCompanyDetails());
      
      roll.sortByWages();
      
      System.out.println(roll.getCompanyDetails());
      
    */
 
    SecureAccount acc = new SecureAccount("1488", "Vladimir", 10.23);
    
    System.out.println(acc.getPin());
      
    }
}

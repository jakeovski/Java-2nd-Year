package lab01;



public class Test {
    
    public static void main(String[] args) {
       
        //Test for Student class
        //Creating an object
        //Student student1 = new Student("1807132","Vlad",19);
        
        /*
        //Testing getters
        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getTime());
        */
        
        /*
        //Testing setters
        student1.setName("Vladimir");
        student1.setAge(20);
        student1.setTime(60);
        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getTime());
        */
        
        //Testing other methods
        /*
        System.out.println(student1.toString());
        student1.getOld();
        
        student1.addTime(120);
        
        System.out.println(student1.toString());
        */
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        //-----------------------Task 3 Test----------------------------
        /*
        //Creating an object
        Employee employee1 = new Employee("Vladimir",18, "Manager");
       
        //Testing getters
        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getJobTitle());
        System.out.println("---------------------------------------");
        
        //Testing setters
        
        employee1.setName("Vlad");
        employee1.setAge(20);
        employee1.setJobTitle("Sky Pro");
        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getJobTitle());
        
        //Testing toString
        System.out.println(employee1.toString());
        
        //Testing wage() method
        System.out.println(employee1.wage(10));
        */
        
        //-------------------------------------------------------------
        //-------------------------Task 4 Test-------------------------
        
        //Creating an instance of an object
        MobilePhone phone = new MobilePhone("+37253264750", 2.0);
       // MobilePhone phone1 = new MobilePhone("+37253264750", 5.00, "Nokia 3310");
        
        /*
        //Testing getters
        System.out.println(phone.getNumber());
        System.out.println(phone.getBalance());
        System.out.println(phone.getMODEL());
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getBalance());
        System.out.println(phone1.getMODEL());
        */
        
        /*
        //Testing setters
        phone.setNumber("+44 53264750");
        phone.setBalance(2.0);
        System.out.println(phone.getNumber());
        System.out.println(phone.getBalance());
        System.out.println(phone.getMODEL());
        */
        
        //Testing toString() method
        System.out.println(phone.toString());
        
        //Testing sendText() method
        phone.sendText();
        System.out.println(phone.toString());
        
        //Testing makeCall() method
        phone.makeCall(7);
        System.out.println(phone.toString());
        
    }
}
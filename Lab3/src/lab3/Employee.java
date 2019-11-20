package lab3;


public class Employee extends Person {
    
    private int years;

    public Employee(int years, String name, String age, String number) {
        super(name, age, number);
        this.years = years;
    }
    
    //--------------------Getters---------------

    public int getYears() {
        return years;
    }
    
    //--------------------Setters--------------

    public void setYears(int years) {
        this.years = years;
    }
    
    //--------------------Others--------------

    @Override public String toString() {
        return "Employee: " + super.toString() + " worked for " + getYears() + " years";
    }
    
    public int getHoliday() {
        int holiday = 15;
        for (int i = 1;i <= years; i++ ) {
            if ( i % 5 == 0) {
                holiday++;
            }
        }
        return holiday;
    }
    
    
}
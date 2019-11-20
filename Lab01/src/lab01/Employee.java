package lab01;


/**
 * Class that stores an information about an emplyee.
 * @author Pierre
 * @version 1.0
 */
public class Employee {
    
    //-----------------Field---------------------------
    
    /**
     * Name of the employee
     */
    private String name;
    
    /**
     * Emplyee's age
     */
    private int age;
    
    /**
     * Employee's job title
     */
    private String jobTitle;

    /**
     * Default constructor
     * @param name Name of the employee
     * @param age Age of the employee
     * @param jobTitle Job title of the employee
     */
    public Employee(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }
    
    //-----------------Getters--------------------------

    /**
     * Gets name of the employee
     * @return Name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Gets age of the employee
     * @return Age of the employee
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets job title of the employee
     * @return Job title
     */
    public String getJobTitle() {
        return jobTitle;
    }
    
    //-------------------Setters----------------------

    /**
     * Sets name of the employee
     * @param name Name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets age of the employee
     * @param age Age of the employee
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets job title of the employee
     * @param jobTitle Job title of the employee
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    
    //------------------Other-------------------------

    /**
     * toString method
     * @return Information in the field
     */
    public String toString() {
        return "Employee: " + getName() + "\nAge: " + getAge() + "\nJob Title: " + getJobTitle();
    }
    
    public double wage(int hours) {
        double pounds = 0;
        if(getAge() < 18) {
            pounds = 4.35 * hours;
        }
        else if(getAge() >= 18 && getAge() <= 20) {
            pounds = 6.15 * hours;
        }
        else if(getAge() >= 21 && getAge() <= 24) {
            pounds = 7.7 * hours;
        }
        else if (getAge() >= 25 && getAge() <= 63) {
            pounds = 8.21 * hours;
        }
        else if (getAge() > 63) {
            System.out.println("You are too old to work");
        }
        else {
            System.out.println("Please try agein! Error!");
        }
        return pounds;
    }
}
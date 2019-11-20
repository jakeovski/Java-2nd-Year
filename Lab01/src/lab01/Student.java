package lab01;


public class Student {
    
    private final String ID;
    
    //Name of student
    private String name;
    
    //Age of the student
    private int age;
    
    //Time logged in
    private int time;

    /**
     * Default constructor
     * @param id Matriculation number
     * @param name Name of the student
     * @param age Age of the student
     * @param time Time logged in
     */
    public Student(String id, String name, int age, int time) {
        this.ID = id;
        this.name = name;
        this.age = age;
        this.time = time;
    }
    
    /**
     * 2nd constructor
     * @param id Matriculation number
     * @param name Name of the student
     * @param age  Age of the student
     */
    public Student(String id, String name, int age) {
        this.ID = id;
        this.name = name;
        this.age = age;
        time = 0;
    }

    //---------------------Getters----------------------
    
    /**
     * Gets Matriculation number
     * @return Matriculation number
     */
    public String getId() {
        return ID;
    }

    /**
     * Gets name of the student
     * @return Name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Gets age of the student 
     * @return Age of the student
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Gets time logged in
     * @return  Time logged in
     */
    public int getTime() {
        return time;
    }
    
    //----------------------Setters-----------------------------

    /**
     * Sets student's name
     * @param name Name of the student
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets student's age
     * @param age Age of the student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets time logged in
     * @param time Time logged in
     */
    public void setTime(int time) {
        this.time = time;
    }
    
    //-----------------------Other methods---------------------
    
    /**
     * toString() method
     * @return Information in the field
     */
    public String toString() {
        return "Matriculation number: " + getId() + "\nName: " + getName() + "\nAge: " + getAge() + "\nTime logged in: " + getTime();
    }
    
    /**
     * Increments student's age
     * @return Students age
     */
    public int getOld() {
        setAge(getAge() + 1);
        return getAge();
    }
    
    /**
     * Adds value to log in time
     * @param seconds seconds to add
     * @return new time
     */
    public int addTime(double seconds) {
        int newSeconds = (int)seconds;
        setTime(getTime() + newSeconds);
        return getTime();
    }
    
    
}